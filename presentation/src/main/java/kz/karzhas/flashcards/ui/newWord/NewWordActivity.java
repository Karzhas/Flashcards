package kz.karzhas.flashcards.ui.newWord;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import kz.karzhas.flashcards.R;

public class NewWordActivity extends AppCompatActivity {
    @BindView(R.id.txt_in_english) EditText inEnglish;
    @BindView(R.id.txt_translation) EditText translation;
    @BindView(R.id.asdasd) TextView addWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);
        ButterKnife.bind(this);
        addWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(inEnglish.getText().toString().equals("") || translation.getText().toString().equals("")){
//                    Toast.makeText(NewWordActivity.this, "Can't be empty!", Toast.LENGTH_SHORT).show();
//                    return;
//                }
                Intent intent = new Intent();
                intent.putExtra("front", inEnglish.getText().toString());
                intent.putExtra("back", translation.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}

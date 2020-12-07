package kz.karzhas.flashcards.ui.flashcards;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import kz.karzhas.data.entity.FlashcardMockEntity;
import kz.karzhas.data.util.MOCK;
import kz.karzhas.flashcards.R;
import kz.karzhas.flashcards.ui.learn.LearnActivity;
import kz.karzhas.flashcards.ui.newWord.NewWordActivity;

public class FlashcardsActivity extends AppCompatActivity {
    int categoryId;
    @BindView(R.id.rec_flashcards) RecyclerView rec;
    @BindView(R.id.constr_new_word) ConstraintLayout newWord;
    @BindView(R.id.txt_add_word) TextView learn;

    FlashcardsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcards);
        ButterKnife.bind(this);
        categoryId = getIntent().getIntExtra("id", 0);
        setupRecycler();
        showAllCards();
        newWord.setOnClickListener(this::onNewWordClick);
        learn.setOnClickListener(this::onLearnClick);
    }

    private void onLearnClick(View view) {
        Intent intent = new Intent(this, LearnActivity.class).putExtra("id", categoryId);
        startActivityForResult(intent, 2);
    }

    private void showAllCards() {
        adapter.setFlashcards(MOCK.getCategory(categoryId).getFlashcards());
        if(MOCK.getCategory(categoryId).getFlashcards().size() != 0)
            learn.setVisibility(View.VISIBLE);
        adapter.notifyDataSetChanged();
    }

    private void onNewWordClick(View view) {
        Intent intent = new Intent(this, NewWordActivity.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        String frontside = data.getStringExtra("front");
        String backside = data.getStringExtra("back");
        //
        frontside = "hello";
        backside = "olleh";

        //
        for(int i = 0; i < 4; i++)
            MOCK.getCategory(categoryId).getFlashcards().add(new FlashcardMockEntity(frontside, backside));
        learn.setVisibility(View.VISIBLE);
        showAllCards();

    }

    private void setupRecycler() {
        adapter = new FlashcardsAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rec.setHasFixedSize(true);
        rec.setLayoutManager(layoutManager);
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(rec);
        List<FlashcardMockEntity> flashcards = new ArrayList<>();
        flashcards.add(new FlashcardMockEntity());
        flashcards.add(new FlashcardMockEntity());
        flashcards.add(new FlashcardMockEntity());
//        flashcards.add(new FlashcardMockEntity());
//        flashcards.add(new FlashcardMockEntity());
//        flashcards.add(new FlashcardMockEntity());
//        flashcards.add(new FlashcardMockEntity());
//        flashcards.add(new FlashcardMockEntity());
//        adapter.setFlashcards(flashcards);
        rec.setAdapter(adapter);

    }
}

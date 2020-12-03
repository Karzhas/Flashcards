package kz.karzhas.flashcards;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import kz.karzhas.flashcards.ui.categories.CategoriesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       startActivity(new Intent(this, CategoriesActivity.class));
       // TextView diskView =  findViewById(R.id.asd);
      //  diskView.setRotationY(180f);

//        Animation an = new RotateAnimation(0.0f, 360.0f, 111, 111);
//        an.setDuration(10000);               // duration in ms
//        an.setRepeatCount(0);                // -1 = infinite repeated
//        an.setRepeatMode(Animation.REVERSE); // reverses each repeat
//        an.setFillAfter(true);               // keep rotation after animation
//        diskView.setAnimation(an);
    }
}

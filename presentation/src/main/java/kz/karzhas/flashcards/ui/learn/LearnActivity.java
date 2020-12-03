package kz.karzhas.flashcards.ui.learn;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import kz.karzhas.flashcards.R;
import kz.karzhas.flashcards.models.FlashcardViewModel;
import kz.karzhas.flashcards.ui.learn.adapter.FlashcardsAdapter;
import kz.karzhas.flashcards.ui.swipecard.SwipeCardView;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        ArrayList<FlashcardViewModel> cards = new ArrayList<>();
        cards.add(new FlashcardViewModel(1,"fr1", "ba1", 1));
        cards.add(new FlashcardViewModel(2,"fr2", "ba2", 2));
        cards.add(new FlashcardViewModel(3,"fr3", "ba3", 3));

        SwipeCardView s = findViewById(R.id.swipe);
        FlashcardsAdapter flashcardsAdapter = new FlashcardsAdapter(this, cards);
        s.setAdapter(flashcardsAdapter);
        s.setFlingListener(new SwipeCardView.OnCardFlingListener() {
            @Override
            public void onCardExitLeft(Object dataObject) {

            }

            @Override
            public void onCardExitRight(Object dataObject) {

            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {

            }

            @Override
            public void onScroll(float scrollProgressPercent) {

            }

            @Override
            public void onCardExitTop(Object dataObject) {

            }

            @Override
            public void onCardExitBottom(Object dataObject) {

            }
        });
    }
}

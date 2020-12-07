package kz.karzhas.flashcards.ui.learn;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import kz.karzhas.data.entity.FlashcardMockEntity;
import kz.karzhas.data.util.MOCK;
import kz.karzhas.flashcards.R;
import kz.karzhas.flashcards.ui.learn.adapter.FlashcardsAdapter;
import kz.karzhas.flashcards.ui.swipecard.SwipeCardView;

public class LearnActivity extends AppCompatActivity{
    int categoryId;
    @BindView(R.id.learn_root)
    ConstraintLayout root;
    @BindView(R.id.txt_verdict)
    TextView verdict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        ButterKnife.bind(this);

        categoryId = getIntent().getIntExtra("id", 0);
        List<FlashcardMockEntity> flashcards = MOCK.getCategory(categoryId).getFlashcards();

        SwipeCardView s = findViewById(R.id.swipe);
        FlashcardsAdapter flashcardsAdapter = new FlashcardsAdapter(this, flashcards);
        s.setAdapter(flashcardsAdapter);
        s.setFlingListener(new SwipeCardView.OnCardFlingListener() {
            @Override
            public void onCardExitLeft(Object dataObject) {
                verdict.setVisibility(View.GONE);
//                verdict.setText("Need to review");
                root.setBackgroundResource(R.drawable.learn_standart);
            }

            @Override
            public void onCardExitRight(Object dataObject) {
                verdict.setVisibility(View.GONE);
//                verdict.setText("Need to review");
                root.setBackgroundResource(R.drawable.learn_standart);
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
                verdict.setVisibility(View.GONE);
//                verdict.setText("Need to review");
                root.setBackgroundResource(R.drawable.learn_standart);
            }

            @Override
            public void onScroll(float scrollProgressPercent) {
             
            }

            @Override
            public void onCardExitTop(Object dataObject) {
                verdict.setVisibility(View.GONE);
//                verdict.setText("Need to review");
                root.setBackgroundResource(R.drawable.learn_standart);
            }

            @Override
            public void onCardExitBottom(Object dataObject) {
                verdict.setVisibility(View.GONE);
//                verdict.setText("Need to review");
                root.setBackgroundResource(R.drawable.learn_standart);
            }

            @Override
            public void onReview() {
                verdict.setVisibility(View.VISIBLE);
                verdict.setText("Need to review");
                root.setBackgroundResource(R.drawable.learn_review);

            }

            @Override
            public void onRight() {
                verdict.setVisibility(View.VISIBLE);
                verdict.setText("I got it right");
                root.setBackgroundResource(R.drawable.learn_right);

            }

            @Override
            public void onCenter() {
                verdict.setVisibility(View.GONE);
//                verdict.setText("Need to review");
                root.setBackgroundResource(R.drawable.learn_standart);

            }
        });
    }


}

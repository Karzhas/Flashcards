package kz.karzhas.flashcards.ui.learn.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import kz.karzhas.data.entity.FlashcardMockEntity;
import kz.karzhas.flashcards.R;

public class FlashcardsAdapter extends ArrayAdapter<FlashcardMockEntity> {
    private List<FlashcardMockEntity> flashcards;
    private  LayoutInflater layoutInflater;

    public FlashcardsAdapter(Context context, List<FlashcardMockEntity> cards) {
        super(context, -1);
        this.flashcards = cards;
        this.layoutInflater = LayoutInflater.from(context);
    }
    @Override public View getView(int position, View convertView, ViewGroup parent) {
        FlashcardMockEntity card = flashcards.get(position);
        View view = layoutInflater.inflate(R.layout.swipable_flashcard_item, parent, false);
        ((TextView) view.findViewById(R.id.txt_title)).setText(card.getFrontside());
        //view.findViewById(R.id.helloText)).setText(card.name);
        return view;

    }

    @Override public FlashcardMockEntity getItem(int position) {
        return flashcards.get(position);
    }

    @Override public int getCount() {
        return flashcards.size();
    }

}

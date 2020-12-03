package kz.karzhas.flashcards.ui.learn.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import kz.karzhas.flashcards.R;
import kz.karzhas.flashcards.models.FlashcardViewModel;

public class FlashcardsAdapter extends ArrayAdapter<FlashcardViewModel> {
    private ArrayList<FlashcardViewModel> flashcards;
    private  LayoutInflater layoutInflater;

    public FlashcardsAdapter(Context context, ArrayList<FlashcardViewModel> cards) {
        super(context, -1);
        this.flashcards = cards;
        this.layoutInflater = LayoutInflater.from(context);
    }
    @Override public View getView(int position, View convertView, ViewGroup parent) {
        FlashcardViewModel card = flashcards.get(position);
        View view = layoutInflater.inflate(R.layout.flashcard_item, parent, false);
        ((TextView) view.findViewById(R.id.txt_title)).setText(card.getFrontside());
        //view.findViewById(R.id.helloText)).setText(card.name);
        return view;

    }

    @Override public FlashcardViewModel getItem(int position) {
        return flashcards.get(position);
    }

    @Override public int getCount() {
        return flashcards.size();
    }

}

package kz.karzhas.flashcards.ui.flashcards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kz.karzhas.data.entity.FlashcardMockEntity;
import kz.karzhas.flashcards.R;

public class FlashcardsAdapter extends RecyclerView.Adapter<FlashcardsAdapter.ViewHolder> {
    List<FlashcardMockEntity> flashcards;

    public void setFlashcards(List<FlashcardMockEntity> flashcards) {
        this.flashcards = flashcards;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.flashcard_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getBack().setText(flashcards.get(position).getBackside());
        holder.getFront().setText(flashcards.get(position).getFrontside());
    }

    @Override
    public int getItemCount() {
        if(flashcards == null)
            return 0;
        return flashcards.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView front;
        TextView back;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            front = itemView.findViewById(R.id.itm_txt_front);
            back = itemView.findViewById(R.id.itm_txt_back);
        }

        public TextView getFront() {
            return front;
        }

        public TextView getBack() {
            return back;
        }

        public void setFront(TextView front) {
            this.front = front;
        }

        public void setBack(TextView back) {
            this.back = back;
        }
    }
}

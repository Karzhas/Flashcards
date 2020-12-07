package kz.karzhas.flashcards.ui.categories;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kz.karzhas.data.entity.CategoryMockEntity;
import kz.karzhas.flashcards.R;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {
    List<CategoryMockEntity> categories;
    Context context;
    CategoriesContract.View activity;



    public CategoriesAdapter(Context context) {
        this.context = context;
    }

    public void setCategories(List<CategoryMockEntity> categories) {
        this.categories = categories;
    }

    public void setActivity(CategoriesContract.View activity) {
        this.activity = activity;
    }

    @NonNull
    @Override
    public CategoriesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.ViewHolder holder, int position) {
        View circleOne = holder.getCircleOne();
        View circleTwo = holder.getCircleSecond();
        ConstraintLayout categoryCard = holder.getCategoryCard();
        TextView categoryTitle = holder.getCategoryTitle();
        TextView numberOfPhrases = holder.getNumberOfPhrases();
        TextView semicircle = holder.getSemicircle();
        ImageView arrows = holder.getArrows();
        categoryTitle.setText(categories.get(position).getTitle());
        numberOfPhrases.setText("0 phrases");
        if(position % 3 == 0){
            categoryCard.setBackgroundResource(R.drawable.categories_item_card_1);
            circleOne.setBackgroundResource(R.drawable.categories_item_circle_1);
            circleTwo.setBackgroundResource(R.drawable.categories_item_circle_1);
            categoryTitle.setTextColor(context.getResources().getColorStateList(R.color.white));
            numberOfPhrases.setTextColor(context.getResources().getColorStateList(R.color.lightBlue));
            semicircle.setBackgroundResource(R.drawable.categories_item_semicircle_1);
            numberOfPhrases.setBackgroundResource(R.drawable.categories_item_txt_number_of_phrases_1);
            arrows.setBackgroundResource(R.drawable.categories_item_img_arrows_1);
        }else if(position % 3 == 1){
            categoryCard.setBackgroundResource(R.drawable.categories_item_card_2);
            circleOne.setBackgroundResource(R.drawable.categories_item_circle_2);
            circleTwo.setBackgroundResource(R.drawable.categories_item_circle_2);
            categoryTitle.setTextColor(context.getResources().getColorStateList(R.color.white));
            numberOfPhrases.setTextColor(context.getResources().getColorStateList(R.color.lightRed));
            numberOfPhrases.setBackgroundResource(R.drawable.categories_item_txt_number_of_phrases_2);
            semicircle.setBackgroundResource(R.drawable.categories_item_semicircle_2);
            arrows.setBackgroundResource(R.drawable.categories_item_img_arrows_2);
        }else if(position % 3 == 2){
            categoryCard.setBackgroundResource(R.drawable.categories_item_card_3);
            circleOne.setBackgroundResource(R.drawable.categories_item_circle_3);
            circleTwo.setBackgroundResource(R.drawable.categories_item_circle_3);
            numberOfPhrases.setBackgroundResource(R.drawable.categories_item_txt_number_of_phrases_3);
            categoryTitle.setTextColor(context.getResources().getColorStateList(R.color.lightBlue));
            numberOfPhrases.setTextColor(context.getResources().getColorStateList(R.color.lightYellow));
            semicircle.setBackgroundResource(R.drawable.categories_item_semicircle_3);
            arrows.setBackgroundResource(R.drawable.categories_item_img_arrows_3);
        }
        categoryCard.setOnClickListener(view -> {
            activity.onCategoryClick(view);
        });
    }

    @Override
    public int getItemCount() {
        if(categories == null)
            return 0;
        return categories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView categoryTitle;
        private TextView numberOfPhrases;
        private ConstraintLayout categoryCard;
        private View circleOne;
        private View circleSecond;
        private TextView semicircle;
        private ImageView arrows;



        public ViewHolder(View view) {
            super(view);
            categoryTitle = view.findViewById(R.id.txt_category_title);
            numberOfPhrases = view.findViewById(R.id.txt_category_count_cards);
            categoryCard = view.findViewById(R.id.category_item_card);
            circleOne = view.findViewById(R.id.category_item_circle_1);
            circleSecond = view.findViewById(R.id.category_item_circle_2);
            semicircle = view.findViewById(R.id.category_item_semicircle);
            arrows = view.findViewById(R.id.category_item_arrows);
        }

        public TextView getCategoryTitle() {
            return categoryTitle;
        }

        public TextView getNumberOfPhrases() {
            return numberOfPhrases;
        }

        public ConstraintLayout getCategoryCard() {
            return categoryCard;
        }

        public View getCircleOne() {
            return circleOne;
        }

        public View getCircleSecond() {
            return circleSecond;
        }

        public TextView getSemicircle() {
            return semicircle;
        }

        public ImageView getArrows() {
            return arrows;
        }
    }
}

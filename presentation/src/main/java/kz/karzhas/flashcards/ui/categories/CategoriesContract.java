package kz.karzhas.flashcards.ui.categories;

import java.util.List;

import kz.karzhas.data.entity.CategoryMockEntity;

public interface CategoriesContract {
    interface View{
        void showCategories(List<CategoryMockEntity> categories);
        void onCategoryClick(android.view.View view);
    }
}

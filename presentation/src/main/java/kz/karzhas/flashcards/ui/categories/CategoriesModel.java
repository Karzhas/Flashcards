package kz.karzhas.flashcards.ui.categories;

import kz.karzhas.data.entity.CategoryMockEntity;
import kz.karzhas.data.util.MOCK;

public class CategoriesModel {
    public void addNewCategory(String title){
        MOCK.categories.add(new CategoryMockEntity(MOCK.ID, title));
    }
}

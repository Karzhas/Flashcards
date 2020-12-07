package kz.karzhas.flashcards.ui.categories;

import java.util.List;

import kz.karzhas.data.entity.CategoryMockEntity;
import kz.karzhas.data.util.MOCK;

public class CategoriesModel {
    public void addNewCategory(String title){
        MOCK.addCategory(title);
    }
    public List<CategoryMockEntity> getCategories(){
        return MOCK.getCategories();
    }
}

package kz.karzhas.data.util;

import java.util.ArrayList;
import java.util.List;

import kz.karzhas.data.entity.CategoryMockEntity;

public class MOCK {
    public static int ID = 7;
    public static List<CategoryMockEntity> categories = new ArrayList<CategoryMockEntity>(){
        {
            add(new CategoryMockEntity(0, "Daily conversation"));
            add(new CategoryMockEntity(1, "Idioms"));
            add(new CategoryMockEntity(2, "IT-terms"));
            add(new CategoryMockEntity(3, "C1 level vocab"));
            add(new CategoryMockEntity(4, "Nouns"));
            add(new CategoryMockEntity(5, "Verbs"));
            add(new CategoryMockEntity(6, "B2 level vocab"));

        }
    };

    public static void addCategory(String title) {
        categories.add(new CategoryMockEntity(MOCK.ID, title));
        MOCK.ID++;
    }
    public static List<CategoryMockEntity> getCategories() {
        return categories;
    }
    public static CategoryMockEntity getCategory(int id) {
        for(CategoryMockEntity category : categories){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }


}

package kz.karzhas.flashcards.ui.categories;

public class CategoriesPresenter {
    CategoriesModel model;

    public CategoriesPresenter() {
        model = new CategoriesModel();
    }

    public void addNewCategory(String title){
        model.addNewCategory(title);
    }


}

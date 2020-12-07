package kz.karzhas.flashcards.ui.categories;

public class CategoriesPresenter {
    CategoriesModel model;
    CategoriesContract.View view;

    public void setView(CategoriesContract.View view) {
        this.view = view;
    }

    public CategoriesPresenter() {
        model = new CategoriesModel();
    }

    public void addNewCategory(String title){
        model.addNewCategory(title);
        view.showCategories(model.getCategories());
    }

    public void getCategories(){
        view.showCategories(model.getCategories());
    }



}

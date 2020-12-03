package kz.karzhas.flashcards.ui.categories;

import java.util.List;

import kz.karzhas.flashcards.models.CategoryViewModel;
import kz.karzhas.flashcards.ui.abstracts.BaseView;

public interface GroupsContract {
    interface View extends BaseView {
        void showGroups(List<CategoryViewModel> groups);
    }
    interface Presenter<V extends BaseView>{
        void getGroups();
        void addGroup(CategoryViewModel groupModel);
        void deleteGroup(int groupId);
        void onAttach(V view);
        void onDetach();

    }
}

package kz.karzhas.flashcards.ui.categories;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import kz.karzhas.data.entity.CategoryMockEntity;
import kz.karzhas.domain.interactor.group.AddGroupUseCase;
import kz.karzhas.domain.interactor.group.DeleteGroupUseCase;
import kz.karzhas.domain.interactor.group.GetGroupsUseCase;
import kz.karzhas.flashcards.ui.abstracts.BasePresenter;
import kz.karzhas.flashcards.ui.abstracts.BaseView;

public class GroupPresenter<V extends BaseView> extends BasePresenter<V>
                            implements GroupsContract.Presenter<V> {

    private AddGroupUseCase mAddGroupUseCase;
    private DeleteGroupUseCase mDeleteGroupUseCase;
    private GetGroupsUseCase mGetGroupsUseCase;

    public GroupPresenter(CompositeDisposable compositeDisposable,
                          DeleteGroupUseCase deleteGroupUseCase,
                          GetGroupsUseCase getGroupsUseCase,
                          AddGroupUseCase addGroupUseCase) {
        super.mSubscriptions = compositeDisposable;
        this.mDeleteGroupUseCase = deleteGroupUseCase;
        this.mGetGroupsUseCase = getGroupsUseCase;
        this.mAddGroupUseCase = addGroupUseCase;
    }

    @Override
    public void getGroups() {

    }

    @Override
    public void addGroup(CategoryMockEntity groupModel) {

    }

    @Override
    public void deleteGroup(int groupId) {

    }

    @Override
    public void onAttach(V view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mSubscriptions.clear();
        mView = null;
    }
}

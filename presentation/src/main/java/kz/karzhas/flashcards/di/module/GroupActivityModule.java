package kz.karzhas.flashcards.di.module;

import dagger.Module;
import dagger.Provides;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import kz.karzhas.domain.interactor.group.AddGroupUseCase;
import kz.karzhas.domain.interactor.group.DeleteGroupUseCase;
import kz.karzhas.domain.interactor.group.GetGroupsUseCase;
import kz.karzhas.flashcards.di.scope.ActivityScope;
import kz.karzhas.flashcards.ui.categories.GroupPresenter;
import kz.karzhas.flashcards.ui.categories.GroupsActivity;
import kz.karzhas.flashcards.ui.categories.GroupsContract;

@Module
public class GroupActivityModule {

    @ActivityScope
    @Provides
    GroupsContract.Presenter<GroupsActivity> provideGroupPresenter(DeleteGroupUseCase deleteGroupUseCase,
                                                                   GetGroupsUseCase getGroupsUseCase,
                                                                   AddGroupUseCase addGroupUseCase){
        return new GroupPresenter<>(new CompositeDisposable(),
                                    deleteGroupUseCase,
                                    getGroupsUseCase,
                                    addGroupUseCase);
    }
}

package kz.karzhas.flashcards.di.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import kz.karzhas.domain.interactor.group.AddGroupUseCase;
import kz.karzhas.domain.interactor.group.DeleteGroupUseCase;
import kz.karzhas.domain.interactor.group.GetGroupsUseCase;
import kz.karzhas.flashcards.di.module.AppModule;
import kz.karzhas.flashcards.di.module.NetModule;
import kz.karzhas.flashcards.di.module.RxModule;
import kz.karzhas.flashcards.di.module.UseCaseModule;

@Singleton
@Component(
        modules = {
                AppModule.class,
                NetModule.class,
                RxModule.class,
                UseCaseModule.class
        }
)
public interface AppComponent {
    DeleteGroupUseCase deleteGroupUseCase();
    GetGroupsUseCase getGroupUseCase();
    AddGroupUseCase addGroupUseCase();
    Context context();
    //CompositeDisposable compositeDisposable();
}

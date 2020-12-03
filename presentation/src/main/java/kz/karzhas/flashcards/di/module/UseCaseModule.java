package kz.karzhas.flashcards.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import kz.karzhas.data.repository.category.GroupRepositoryImpl;
import kz.karzhas.domain.interactor.group.AddGroupUseCase;
import kz.karzhas.domain.interactor.group.DeleteGroupUseCase;
import kz.karzhas.domain.interactor.group.GetGroupsUseCase;
import kz.karzhas.domain.repository.GroupRepository;

@Module
public class UseCaseModule {

    @Singleton
    @Provides
    GroupRepository provideGroupRepository(){
        return new GroupRepositoryImpl();
    }

    @Singleton
    @Provides
    AddGroupUseCase provideAddGroupUseCase(GroupRepository groupRepository){
        return new AddGroupUseCase(groupRepository);
    }

    @Singleton
    @Provides
    GetGroupsUseCase provideGetGroupsUseCase(GroupRepository groupRepository){
        return new GetGroupsUseCase(groupRepository);
    }

    @Singleton
    @Provides
    DeleteGroupUseCase provideDeleteUseCase(GroupRepository groupRepository){
        return new DeleteGroupUseCase(groupRepository);
    }
}

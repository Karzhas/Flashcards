package kz.karzhas.domain.interactor.group;

import io.reactivex.rxjava3.core.Completable;
import kz.karzhas.domain.interactor.type.CompletableUseCaseWithParameter;
import kz.karzhas.domain.model.Group;
import kz.karzhas.domain.repository.GroupRepository;

public class AddGroupUseCase implements CompletableUseCaseWithParameter<Group> {

    private final GroupRepository groupRepository;

    public AddGroupUseCase(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Completable execute(Group group) {
        return groupRepository.addGroup(group);
    }
}

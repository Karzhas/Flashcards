package kz.karzhas.domain.interactor.group;

import io.reactivex.rxjava3.core.Completable;
import kz.karzhas.domain.interactor.type.CompletableUseCaseWithParameter;
import kz.karzhas.domain.repository.GroupRepository;

public class DeleteGroupUseCase implements CompletableUseCaseWithParameter<Integer> {

    private final GroupRepository groupRepository;

    public DeleteGroupUseCase(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Completable execute(Integer groupId) {
        return groupRepository.deleteGroup(groupId);
    }
}

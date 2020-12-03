package kz.karzhas.domain.interactor.group;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import kz.karzhas.domain.interactor.type.SingleUseCase;
import kz.karzhas.domain.model.Group;
import kz.karzhas.domain.repository.GroupRepository;

public class GetGroupsUseCase implements SingleUseCase<List<Group>> {

    private final GroupRepository groupRepository;

    public GetGroupsUseCase(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Single<List<Group>> execute() {
        return groupRepository.getGroups();
    }
}

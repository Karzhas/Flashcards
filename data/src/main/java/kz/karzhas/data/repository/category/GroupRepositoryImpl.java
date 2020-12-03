package kz.karzhas.data.repository.category;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kz.karzhas.domain.model.Group;
import kz.karzhas.domain.repository.GroupRepository;

public class GroupRepositoryImpl implements GroupRepository {
    @Override
    public Single<List<Group>> getGroups() {
        return null;
    }

    @Override
    public Completable addGroup(Group group) {
        return null;
    }

    @Override
    public Completable deleteGroup(int groupId) {
        return null;
    }
}

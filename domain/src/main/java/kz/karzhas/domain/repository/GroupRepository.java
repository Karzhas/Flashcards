package kz.karzhas.domain.repository;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kz.karzhas.domain.model.Group;

public interface GroupRepository {
    Single<List<Group>> getGroups();
    Completable addGroup(Group group);
    Completable deleteGroup(int groupId);
}

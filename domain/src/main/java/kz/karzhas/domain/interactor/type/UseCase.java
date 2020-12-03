package kz.karzhas.domain.interactor.type;

import io.reactivex.rxjava3.core.Observable;

public interface UseCase<T> {
    Observable<T> execute();
}

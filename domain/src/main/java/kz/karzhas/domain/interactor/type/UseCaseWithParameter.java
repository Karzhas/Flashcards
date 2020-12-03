package kz.karzhas.domain.interactor.type;

import io.reactivex.rxjava3.core.Observable;

public interface UseCaseWithParameter<P, R> {
    Observable<R> execute(P parameter);
}

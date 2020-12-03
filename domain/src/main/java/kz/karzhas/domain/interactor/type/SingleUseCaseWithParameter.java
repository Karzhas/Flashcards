package kz.karzhas.domain.interactor.type;


import io.reactivex.rxjava3.core.Single;

public interface SingleUseCaseWithParameter<P, R> {

    Single<R> execute(P parameter);
}

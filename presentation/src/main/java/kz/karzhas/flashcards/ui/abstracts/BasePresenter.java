package kz.karzhas.flashcards.ui.abstracts;


import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

public abstract class BasePresenter<V extends BaseView> {
    public CompositeDisposable mSubscriptions;
    public V mView;

    public void addSubscription(Disposable disposable){
        mSubscriptions.add(disposable);
    }
}

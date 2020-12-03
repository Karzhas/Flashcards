package kz.karzhas.flashcards.di;

import android.app.Application;

import kz.karzhas.flashcards.di.component.ActivityComponent;
import kz.karzhas.flashcards.di.component.AppComponent;
import kz.karzhas.flashcards.di.component.DaggerActivityComponent;
import kz.karzhas.flashcards.di.component.DaggerAppComponent;
import kz.karzhas.flashcards.di.module.AppModule;

public class FlashcardsApp extends Application {
    private AppComponent mAppComponent;
    private ActivityComponent mActivityComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent(mAppComponent)
                .build();

    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
}

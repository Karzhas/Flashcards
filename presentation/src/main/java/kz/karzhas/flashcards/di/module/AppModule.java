package kz.karzhas.flashcards.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application app) {
        this.mApplication = app;
    }

    @Singleton
    @Provides
    public Application provideApplication(){
        return mApplication;
    }

    @Singleton
    @Provides
    public Context provideContext(){
        return mApplication.getApplicationContext();
    }
}

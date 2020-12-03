package kz.karzhas.flashcards.di.module;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;

import dagger.Module;
import dagger.Provides;
import kz.karzhas.flashcards.di.scope.ActivityScope;
import kz.karzhas.flashcards.ui.categories.CategoriesAdapter;
import kz.karzhas.flashcards.ui.categories.CategoriesPresenter;

@Module
public class CategoriesActivityModule {

    @ActivityScope
    @Provides
    CategoriesAdapter provideCategoriesAdapter(Context context){
        return new CategoriesAdapter(context);
    }

    @ActivityScope
    @Provides
    LinearLayoutManager provideLinearlayoutManager(Context context){
        return new LinearLayoutManager(context);

    }

    @ActivityScope
    @Provides
    CategoriesPresenter provideCategoriesPresenter(){
        return new CategoriesPresenter();
    }
}

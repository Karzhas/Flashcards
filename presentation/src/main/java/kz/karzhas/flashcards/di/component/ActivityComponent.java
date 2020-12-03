package kz.karzhas.flashcards.di.component;

import dagger.Component;
import kz.karzhas.flashcards.di.module.CategoriesActivityModule;
import kz.karzhas.flashcards.di.module.GroupActivityModule;
import kz.karzhas.flashcards.di.scope.ActivityScope;
import kz.karzhas.flashcards.ui.categories.CategoriesActivity;
import kz.karzhas.flashcards.ui.categories.GroupsActivity;

@ActivityScope
@Component(
        dependencies = {
                AppComponent.class,
        },
        modules = {
                GroupActivityModule.class,
                CategoriesActivityModule.class,
        }
)
public interface ActivityComponent {
        void inject(GroupsActivity activity);
        void inject(CategoriesActivity activity);
}

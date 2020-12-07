package kz.karzhas.flashcards.ui.categories;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import javax.inject.Inject;

import kz.karzhas.data.entity.CategoryMockEntity;
import kz.karzhas.flashcards.R;
import kz.karzhas.flashcards.di.FlashcardsApp;

public class GroupsActivity extends AppCompatActivity implements GroupsContract.View{

    @Inject
    public GroupsContract.Presenter<GroupsActivity> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        ((FlashcardsApp)getApplication()).getActivityComponent().inject(this);
        mPresenter.onAttach(this);

    }

    @Override
    public void showGroups(List<CategoryMockEntity> groups) {

    }

    @Override
    public void showErrorMessage(String errorMessage) {

    }
}

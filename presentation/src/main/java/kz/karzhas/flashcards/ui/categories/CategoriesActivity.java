package kz.karzhas.flashcards.ui.categories;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import kz.karzhas.flashcards.R;
import kz.karzhas.flashcards.di.FlashcardsApp;
import kz.karzhas.flashcards.models.CategoryViewModel;
import kz.karzhas.flashcards.ui.flatDialog.FlatDialog;

public class CategoriesActivity extends AppCompatActivity {

    @BindView(R.id.rv_categories) RecyclerView rec;
    @BindView(R.id.txt_title1) TextView txt_title1;
    @BindView(R.id.txt_title2) TextView txt_title2;
    @BindView(R.id.new_category) ConstraintLayout layoutNewCategory;
    @BindView(R.id.img_avatar) ImageView avatar;
    @BindView(R.id.img_notif) View avatarNotification;
    @BindView(R.id.bottom_nav) BottomNavigationView bottomNavigationView;
    @Inject
    LinearLayoutManager layoutManager;
    @Inject
    CategoriesAdapter adapter;
    @Inject CategoriesPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        ButterKnife.bind(this);
        ((FlashcardsApp)getApplication()).getActivityComponent().inject(this);
        setupBottomNavigation();
        setupCategoriesRecycler();

        layoutNewCategory.setOnClickListener(this::onNewCategoryClick);
    }

    private void onNewCategoryClick(View view) {
        final FlatDialog flatDialog = new FlatDialog(CategoriesActivity.this);
        flatDialog.setTitle("New category")
                .setSubtitle("write title of category here")
                .setFirstTextFieldHint("title")
                .setFirstButtonText("ADD")
                .setFirstButtonColor(Color.parseColor("#d3f6f3"))
                .setSecondButtonColor(Color.parseColor("#fee9b2"))
                .setSecondButtonTextColor(Color.parseColor("#000000"))
                .setFirstButtonTextColor(Color.parseColor("#000000"))
                .setTitleColor(Color.parseColor("#000000"))
                .setSubtitleColor(Color.parseColor("#000000"))
                .setFirstTextFieldBorderColor(Color.parseColor("#000000"))
                .setFirstTextFieldTextColor(Color.parseColor("#000000"))
                .setFirstTextFieldHintColor(Color.parseColor("#000000"))
                .setBackgroundColor(Color.parseColor("#f9fce1"))
                .setSecondButtonText("CANCEL")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CategoriesActivity.this, flatDialog.getFirstTextField(), Toast.LENGTH_SHORT).show();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }

    private void setupCategoriesRecycler() {
        rec.setHasFixedSize(true);
        rec.setLayoutManager(layoutManager);
        List<CategoryViewModel> cat = new ArrayList<>();
        cat.add(new CategoryViewModel(1,"1",null));
        cat.add(new CategoryViewModel(1,"2",null));
        adapter.setCategories(cat);
        rec.setAdapter(adapter);
        setupRecyclerScrollListener();

    }

    private void setupRecyclerScrollListener() {
        rec.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (layoutManager.findFirstVisibleItemPosition() > 0) {
                    txt_title1.setVisibility(View.GONE);
                    txt_title2.setVisibility(View.GONE);
                    layoutNewCategory.setVisibility(View.GONE);
                    avatarNotification.setVisibility(View.GONE);
                    avatar.setVisibility(View.GONE);
                } else {
                    txt_title1.setVisibility(View.VISIBLE);
                    txt_title2.setVisibility(View.VISIBLE);
                    layoutNewCategory.setVisibility(View.VISIBLE);
                    avatarNotification.setVisibility(View.VISIBLE);
                    avatar.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void setupBottomNavigation() {
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.action_categories:
                    Log.d("test", "categories");
                    break;
                case R.id.action_statistics:
                    Log.d("test", "statistic");
                    break;
                case R.id.action_settings:
                    Log.d("test", "settings");
                    break;
            }
            return true;
        });
    }
}

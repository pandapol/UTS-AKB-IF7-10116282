package com.pandapol.arvi.uts.view;

/**
 * Created by 10116282 - Arvi Ramadhan - AKB7, 18 Mei 2019
 */

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.pandapol.arvi.uts.Adapter.GalleryAdapter;
import com.pandapol.arvi.uts.Model.GalleryItem;
import com.pandapol.arvi.uts.R;
import com.pandapol.arvi.uts.utils.Tools;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GalleryActivity extends AppCompatActivity {

    private List<GalleryItem> galleryitems = null;
    @BindView(R.id.recyclerView) RecyclerView recyclerView;
    private ActionBar actionBar;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ButterKnife.bind(this);

        initToolbar();
        loadDataGallery();

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        GalleryAdapter GalleryDataAdapter = new GalleryAdapter(getApplicationContext(), galleryitems);
        recyclerView.setAdapter(GalleryDataAdapter);
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.pink_600));
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setTitle("Gallery");
        Tools.setSystemBarColor(this, R.color.pink_700);
    }

    public void loadDataGallery() {
        galleryitems = new ArrayList<GalleryItem>();
        galleryitems.add(new GalleryItem("Jordan Kelvin A.F.", "10116277", R.drawable.img_jordan));
        galleryitems.add(new GalleryItem("Aditia Julianto", "10116280", R.drawable.img_aditia));
        galleryitems.add(new GalleryItem("Andreas Rizki Rizaldi", "10116281", R.drawable.img_andreas));
        galleryitems.add(new GalleryItem("Vanadia Aviandi", "10116287", R.drawable.img_vanadia));
        galleryitems.add(new GalleryItem("Andika Dirgantara", "10116291", R.drawable.img_dika));
        galleryitems.add(new GalleryItem("Husna Kusuma W.", "10116317", R.drawable.img_husna));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

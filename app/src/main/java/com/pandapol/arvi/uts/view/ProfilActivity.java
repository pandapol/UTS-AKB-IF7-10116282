package com.pandapol.arvi.uts.view;

/**
 * Created by 10116282 - Arvi Ramadhan - AKB7, 18-19 Mei 2019
 */

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.pandapol.arvi.uts.Fragment.AboutFragment;
import com.pandapol.arvi.uts.Fragment.ContactFragment;
import com.pandapol.arvi.uts.Fragment.FindMeFragment;
import com.pandapol.arvi.uts.Fragment.ProfileFragment;
import com.pandapol.arvi.uts.R;
import com.pandapol.arvi.uts.utils.Tools;

public class ProfilActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBar actionBar;
    private DrawerLayout drawer;
    private View navigation_header;
    private BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        initToolbar();
        initComponent();
        replace_fragment(new ProfileFragment());
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.pink_600));
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setTitle("My Profil");
        Tools.setSystemBarColor(this, R.color.pink_700);
    }

    private void initComponent() {

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.profile:
                        navigation.setBackgroundColor(getResources().getColor(R.color.pink_800));
                        replace_fragment(new ProfileFragment());
                        return true;
                    case R.id.contact:
                        navigation.setBackgroundColor(getResources().getColor(R.color.pink_800));
                        replace_fragment(new ContactFragment());
                        return true;
                    case R.id.find_me:
                        navigation.setBackgroundColor(getResources().getColor(R.color.pink_800));
                        replace_fragment(new FindMeFragment());
                        return true;
                    case R.id.about:
                        navigation.setBackgroundColor(getResources().getColor(R.color.pink_800));
                        replace_fragment(new AboutFragment());
                        return true;
                }
                return false;
            }
        });
    }

    boolean isNavigationHide = false;

    private void animateNavigation(final boolean hide) {
        if (isNavigationHide && hide || !isNavigationHide && !hide) return;
        isNavigationHide = hide;
        int moveY = hide ? (2 * navigation.getHeight()) : 0;
        navigation.animate().translationY(moveY).setStartDelay(100).setDuration(300).start();
    }
    public void replace_fragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout, fragment);
        transaction.commit();
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

package com.pandapol.arvi.uts.HomeFragment;

/**
 * Created by 10116282 - Arvi Ramadhan - AKB7, 18 Mei 2019
 */

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pandapol.arvi.uts.R;

public class ProfilFragment extends Fragment {

    private View view;
    BottomNavigationView navigation;
    private Toolbar toolbar;
    private ActionBar actionBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_profil, container, false);
        return view;
    }


}

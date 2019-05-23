package com.pandapol.arvi.uts.Fragment;

/**
 * Created by 10116282 - Arvi Ramadhan - AKB7, 18 Mei 2019
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pandapol.arvi.uts.R;

public class ProfileFragment extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_profile, container, false);

        return view;
    }

}

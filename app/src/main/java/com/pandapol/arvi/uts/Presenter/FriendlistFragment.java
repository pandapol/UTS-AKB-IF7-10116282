package com.pandapol.arvi.uts.Presenter;

/**
 * Created by 10116282 - Arvi Ramadhan - AKB7, 18-19 Mei 2019
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pandapol.arvi.uts.Adapter.FriendlistAdapter;
import com.pandapol.arvi.uts.Model.FriendlistItem;
import com.pandapol.arvi.uts.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FriendlistFragment extends Fragment {

    private View view;
    private List<FriendlistItem> friendlistItems = null;

    @BindView(R.id.recyclerView) RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_friendlist, container, false);
        ButterKnife.bind(this, view);

        loadDataFriendlist();

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        FriendlistAdapter FriendlistDataAdapter = new FriendlistAdapter(getContext(), friendlistItems);
        recyclerView.setAdapter(FriendlistDataAdapter);

        return view;
    }

    public void loadDataFriendlist() {
        friendlistItems = new ArrayList<FriendlistItem>();
        friendlistItems.add(new FriendlistItem("Jordan Kelvin A.F.", "10116277", R.drawable.img_jordan));
        friendlistItems.add(new FriendlistItem("Aditia Julianto", "10116280", R.drawable.img_aditia));
        friendlistItems.add(new FriendlistItem("Andreas Rizki Rizaldi", "10116281", R.drawable.img_andreas));
        friendlistItems.add(new FriendlistItem("Vanadia Aviandi", "10116287", R.drawable.img_vanadia));
        friendlistItems.add(new FriendlistItem("Andika Dirgantara", "10116291", R.drawable.img_dika));
        friendlistItems.add(new FriendlistItem("Husna Kusuma W.", "10116317", R.drawable.img_husna));


    }

}

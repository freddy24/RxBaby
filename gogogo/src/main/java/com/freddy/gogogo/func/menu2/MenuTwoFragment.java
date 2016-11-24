/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.func.menu2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freddy.gogogo.R;
import com.freddy.gogogo.func.menu1.DividerGridItemDecorator;

import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Description://TODO
 * Created by freddy on 16/6/2.
 */
public class MenuTwoFragment extends Fragment implements MenuTwoContract.View {

    private MenuTwoContract.Presenter mPresenter;

    private Random random;
    @Bind(R.id.main_cycle_view)
    RecyclerView recyclerView;
    private MainRecyclerViewAdapter recyclerViewAdapter;

    public MenuTwoFragment() {

    }

    public static MenuTwoFragment newInstance() {
        return new MenuTwoFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new MenuTwoPresenter(this);
        recyclerViewAdapter = new MainRecyclerViewAdapter(getActivity(),mPresenter.getAnimals());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_one_frag, container, false);
        ButterKnife.bind(this, view);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.addItemDecoration(new DividerGridItemDecorator(getActivity()));
        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void setPresenter(MenuTwoContract.Presenter presenter) {
        this.mPresenter = presenter;
    }


}

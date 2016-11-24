/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.func.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freddy.gogogo.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Description:
 * Created by freddy on 16/6/2.
 */
public class MainFragment extends Fragment implements MainContract.View {
    private static final String[] titles = new String[]{"数字","生肖","波路","大小双单"};
    @Bind(R.id.view_pager)
    ViewPager viewPager;
    @Bind(R.id.tl_tabs)
    TabLayout tlTabs;

    private MainContract.Presenter mPresenter;

    private MainPagerAdapter adapter;

    public MainFragment() {

    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new MainPagerAdapter(getActivity().getSupportFragmentManager(),mPresenter.initFragments());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_frag, container, false);
        ButterKnife.bind(this, view);
        tlTabs.addTab(tlTabs.newTab().setText(titles[0]));
        tlTabs.addTab(tlTabs.newTab().setText(titles[1]));
        tlTabs.addTab(tlTabs.newTab().setText(titles[2]));
        tlTabs.addTab(tlTabs.newTab().setText(titles[3]));
        viewPager.setAdapter(adapter);
        tlTabs.setupWithViewPager(viewPager);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    public static class MainPagerAdapter extends FragmentPagerAdapter{

        private List<Fragment> fragments;

        public MainPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public int getCount() {
            checkNotNull(fragments);
            if (fragments.size() > 0){
                return fragments.size();
            }
            return -1;
        }
    }
}

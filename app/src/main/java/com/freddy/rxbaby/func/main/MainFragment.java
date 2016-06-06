/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.main;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.freddy.rxbaby.R;
import com.freddy.rxbaby.func.menu1.MenuOneFragment;
import com.freddy.rxbaby.func.menu2.MenuTwoFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Description:
 * Created by freddy on 16/6/2.
 */
public class MainFragment extends Fragment implements MainContract.View {

    @Bind(R.id.view_pager)
    ViewPager viewPager;
    @Bind(R.id.tl_tabs)
    TabLayout tlTabs;

    private MainContract.Presenter mPresenter;

    private List<Fragment> fragments;



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
        fragments = new ArrayList<>();
        fragments.add(MenuOneFragment.newInstance());
        fragments.add(MenuTwoFragment.newInstance());
        fragments.add(MenuOneFragment.newInstance());
        fragments.add(MenuTwoFragment.newInstance());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_frag, container, false);
        ButterKnife.bind(this, view);

        MainPagerAdapter adapter = new MainPagerAdapter(getActivity().getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);
        tlTabs.setupWithViewPager(viewPager);
        TabLayout.Tab tab0 = tlTabs.getTabAt(0);
        TabLayout.Tab tab1 = tlTabs.getTabAt(1);
        TabLayout.Tab tab2 = tlTabs.getTabAt(2);
        TabLayout.Tab tab3 = tlTabs.getTabAt(3);
        checkNotNull(tab0);
        checkNotNull(tab1);
        checkNotNull(tab2);
        checkNotNull(tab3);
        tab0.setCustomView(getTabView(0));
        tab1.setCustomView(getTabView(1));
        tab2.setCustomView(getTabView(2));
        tab3.setCustomView(getTabView(3));
        return view;
    }

    private View getTabView(int position){
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.menu_item_layout, tlTabs, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_icon);
        TextView textView = (TextView) view.findViewById(R.id.tv_text);
        imageView.setImageResource(mPresenter.initMenuIcon()[position]);
        textView.setText(mPresenter.initMenuText()[position]);
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
        public int getCount() {
            checkNotNull(fragments);
            if (fragments.size() > 0){
                return fragments.size();
            }
            return -1;
        }
    }
}

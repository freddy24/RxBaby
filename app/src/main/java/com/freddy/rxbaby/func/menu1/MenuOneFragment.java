/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.freddy.babylib.widget.autoscrollvp.AutoScrollViewPager;
import com.freddy.babylib.widget.autoscrollvp.RecyclingPagerAdapter;
import com.freddy.babylib.widget.pageindicator.CirclePageIndicator;
import com.freddy.rxbaby.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Description: menu one //TODO
 * Created by freddy on 16/6/2.
 */
public class MenuOneFragment extends Fragment implements MenuOneContract.View {

    private MenuOneContract.Presenter mPresenter;

    @Bind(R.id.auto_view_pager)
    AutoScrollViewPager autoViewPager;

    @Bind(R.id.circle_page_indicator)
    CirclePageIndicator circlePageIndicator;

    @Bind(R.id.main_cycle_view)
    RecyclerView recyclerView;

    private AutoScrollViewPagerAdapter adapter;
    private MainRecyclerViewAdapter recyclerViewAdapter;
    public MenuOneFragment() {

    }

    public static MenuOneFragment newInstance() {
        return new MenuOneFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new MenuOnePresenter(this);
        adapter = new AutoScrollViewPagerAdapter(getActivity(),mPresenter.getImageIds());
        recyclerViewAdapter = new MainRecyclerViewAdapter(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_one_frag, container, false);
        ButterKnife.bind(this, view);

        autoViewPager.setAdapter(adapter);
        autoViewPager.setCycle(true);
        autoViewPager.setInterval(2000);
        autoViewPager.setAutoScrollDurationFactor(0.8);
        autoViewPager.startAutoScroll();
        autoViewPager.setCurrentItem(Integer.MAX_VALUE/2 - Integer.MAX_VALUE/2 % mPresenter.getImageIds().size());
        circlePageIndicator.setViewPager(autoViewPager);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),4);
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
    public void setPresenter(MenuOneContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void onResume() {
        super.onResume();
        autoViewPager.startAutoScroll();
    }

    @Override
    public void onPause() {
        super.onPause();
        autoViewPager.stopAutoScroll();
    }

    public static class AutoScrollViewPagerAdapter extends RecyclingPagerAdapter{

        private Context context;
        private boolean isInfiniteLoop;
        private List<Integer> imageIds;

        public AutoScrollViewPagerAdapter(Context context, @NonNull List<Integer> imageIds){
            this.context = context;
            this.imageIds = imageIds;
            isInfiniteLoop = false;
        }

        private int getPosition(int position){
            return isInfiniteLoop ? position % imageIds.size() : position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup container) {
            ViewHolder viewHolder;
            if (convertView == null){
                viewHolder = new ViewHolder();
                convertView = new ImageView(context);
                viewHolder.imageView = (ImageView) convertView;
                viewHolder.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                convertView.setTag(viewHolder);
            }else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.imageView.setImageResource(imageIds.get(getPosition(position)));
            return convertView;
        }

        @Override
        public int getCount() {
            checkNotNull(imageIds, "please set imageIds values");
            return isInfiniteLoop ? Integer.MAX_VALUE : imageIds.size();
        }

        public void setInfiniteLoop(boolean infiniteLoop) {
            isInfiniteLoop = infiniteLoop;
        }
    }

    private static class ViewHolder{
        ImageView imageView;
    }
}

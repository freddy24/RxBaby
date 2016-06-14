/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu2;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.freddy.rxbaby.R;

import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Description://TODO
 * Created by freddy on 16/6/2.
 */
public class MenuTwoFragment extends Fragment implements MenuTwoContract.View{

    private MenuTwoContract.Presenter mPresenter;
    private SearchRVAdapter adapter;

    private Random random;
    @Bind(R.id.rv_search)
    RecyclerView rvSearch;

    public MenuTwoFragment() {

    }

    public static MenuTwoFragment newInstance() {
        return new MenuTwoFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new MenuTwoPresenter(this);
        adapter = new SearchRVAdapter(getActivity());

        random = new Random();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_two_frag, container, false);
        ButterKnife.bind(this, view);

        rvSearch.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        rvSearch.setAdapter(adapter);
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

    public class SearchRVAdapter extends RecyclerView.Adapter<SearchRVViewHolder>{

        private Context context;

        public SearchRVAdapter(Context context){
            this.context = context;
        }

        @Override
        public SearchRVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false);
            return new SearchRVViewHolder(view);
        }

        @Override
        public void onBindViewHolder(SearchRVViewHolder holder, int position) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) holder.textView.getLayoutParams();
            int max = 300;
            int min = 150;
            layoutParams.height = random.nextInt(max) % (max-min+1)+min;
            layoutParams.leftMargin = 2;
            layoutParams.rightMargin = 2;
            layoutParams.topMargin = 2;
            layoutParams.bottomMargin = 2;
            holder.textView.setBackgroundColor(Color.parseColor("#dd8844"));
            holder.textView.setText(mPresenter.getSearchTexts()[position]);
        }

        @Override
        public int getItemCount() {
            return mPresenter.getSearchTexts().length;
        }
    }

    public static class SearchRVViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public SearchRVViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(android.R.id.text1);
        }
    }
}

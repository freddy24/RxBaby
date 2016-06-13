/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.freddy.rxbaby.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Description:
 * Created by freddy on 16/6/13.
 */
public class MainRecyclerViewAdapter extends RecyclerView.Adapter<MainRecyclerViewAdapter.GridItemViewHolder> {

    private int[] icons = new int[]{R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                                    R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    private String[] titles = new String[]{"我的小区", "我的钱包", "我的账单", "物业缴费", "生活缴费", "车位缴费"};
    private Context context;

    public MainRecyclerViewAdapter(Context context){
        this.context = context;
    }

    @Override
    public GridItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(context).inflate(R.layout.main_grid_item_layout, parent, false);
        return new GridItemViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(GridItemViewHolder holder, int position) {
        holder.imageView.setBackgroundResource(icons[position]);
        holder.textView.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return icons.length;
    }

    public class GridItemViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public GridItemViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_icon);
            textView = (TextView) itemView.findViewById(R.id.tv_text);
        }
    }
}

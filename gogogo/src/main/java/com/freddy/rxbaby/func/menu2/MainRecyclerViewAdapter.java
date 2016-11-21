/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.freddy.rxbaby.R;
import com.freddy.rxbaby.data.bean.Animal;
import com.freddy.rxbaby.data.bean.HNumber;
import com.freddy.rxbaby.view.ItemClickListener;

import java.util.List;

/**
 * Description:
 * Created by freddy on 16/6/13.
 */
public class MainRecyclerViewAdapter extends RecyclerView.Adapter<MainRecyclerViewAdapter.GridItemViewHolder> {

    private Context context;
    private List<Animal> mAnimals;
    private ItemClickListener onItemClickListener;

    public MainRecyclerViewAdapter(Context context, List<Animal> animals){
        this.context = context;
        this.mAnimals = animals;
    }

    @Override
    public GridItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(context).inflate(R.layout.main_grid_item_layout, parent, false);
        return new GridItemViewHolder(viewItem, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(GridItemViewHolder holder, int position) {
        Animal animal = mAnimals.get(position);
        if (animal.isChoose()){
            holder.itemView.setSelected(true);
            holder.textView.setSelected(true);

            holder.tvMoney.setVisibility(View.VISIBLE);
            holder.tvMoney.setText(String.valueOf(animal.getMoney()));
        }else{
            holder.itemView.setSelected(false);
            holder.textView.setSelected(false);

            holder.tvMoney.setVisibility(View.VISIBLE);
            holder.tvMoney.setText(String.valueOf(animal.getMoney()));
        }
        holder.textView.setText(mAnimals.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mAnimals.size();
    }

    public void setOnItemClickListener(ItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public class GridItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvMoney;
        TextView textView;
        View itemView;
        private ItemClickListener mItemClickListener;
        public GridItemViewHolder(View itemView, ItemClickListener onItemClickListener) {
            super(itemView);
            this.itemView = itemView;
            tvMoney = (TextView) itemView.findViewById(R.id.tv_money);
            textView = (TextView) itemView.findViewById(R.id.tv_text);
            this.mItemClickListener = onItemClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mItemClickListener != null){
                mItemClickListener.OnItemClickListener(v, getAdapterPosition());
            }
        }
    }
}

/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.freddy.babylib.dialog.DialogClickListener;
import com.freddy.babylib.utils.StringUtil;
import com.freddy.babylib.utils.ToastUtil;
import com.freddy.rxbaby.R;
import com.freddy.rxbaby.data.Constant;
import com.freddy.rxbaby.data.bean.HNumber;
import com.freddy.rxbaby.dialog.InputDialog;
import com.freddy.rxbaby.view.ItemClickListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Description: menu one //TODO viewpager的循环轮播配合pageIndicator目前还有问题，没有修改好，记得fix
 * Created by freddy on 16/6/2.
 */
public class MenuOneFragment extends Fragment implements MenuOneContract.View {

    private MenuOneContract.Presenter mPresenter;

    @Bind(R.id.main_cycle_view)
    RecyclerView recyclerView;

    private InputDialog mInputDialog;

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
        recyclerViewAdapter = new MainRecyclerViewAdapter(getActivity(),mPresenter.getNumbers());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_one_frag, container, false);
        ButterKnife.bind(this, view);

        recyclerViewAdapter.setOnItemClickListener(new ItemClickListener() {
            @Override
            public void OnItemClickListener(View view, int position) {
                mPresenter.refreshNumber(position);
                recyclerViewAdapter.notifyDataSetChanged();
            }
        });

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
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void showInputDialog(final HNumber hNumber) {
        mInputDialog = new InputDialog(getContext(), hNumber, new DialogClickListener() {
            @Override
            public void leftClickListener() {
                hNumber.setChoose(false);
                recyclerViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void rightClickListener() {
                String money = mInputDialog.getInputMoney();
                if (!StringUtil.isStringNull(money)){
                    hNumber.setMoney(Double.parseDouble(money));
                    recyclerViewAdapter.notifyDataSetChanged();
                    mInputDialog.dismiss();
                }
            }
        });
        mInputDialog.show();
    }
}

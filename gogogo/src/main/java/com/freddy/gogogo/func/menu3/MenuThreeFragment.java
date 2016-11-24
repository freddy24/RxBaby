package com.freddy.gogogo.func.menu3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freddy.gogogo.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wujinpeng on 2016/11/24.
 */
public class MenuThreeFragment extends Fragment implements MenuThreeContract.View {

    private MenuThreeContract.Presenter mPresenter;

    public static MenuThreeFragment newInstance() {
        return new MenuThreeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new MenuThreePresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_three_frag, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void setPresenter(MenuThreeContract.Presenter presenter) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.tv_red, R.id.tv_green, R.id.tv_blue})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_red:
                break;
            case R.id.tv_green:
                break;
            case R.id.tv_blue:
                break;
        }
    }
}

package com.freddy.rxbaby.func.menu4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freddy.rxbaby.R;
import com.freddy.rxbaby.func.menu3.MenuThreeContract;
import com.freddy.rxbaby.func.menu3.MenuThreePresenter;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 *
 * Created by wujinpeng on 2016/11/24.
 */
public class MenuFourFragment extends Fragment implements MenuFourContract.View {

    private MenuFourContract.Presenter mPresenter;

    public static MenuFourFragment newInstance() {
        return new MenuFourFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new MenuFourPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_four_frag, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void setPresenter(MenuFourContract.Presenter presenter) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

}

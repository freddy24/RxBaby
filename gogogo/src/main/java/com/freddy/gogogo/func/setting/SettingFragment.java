package com.freddy.gogogo.func.setting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freddy.gogogo.R;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class SettingFragment extends Fragment implements SettingContract.View{
    @Override
    public void setPresenter(SettingContract.Presenter presenter) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.setting_frag, null);
        return view;
    }
}

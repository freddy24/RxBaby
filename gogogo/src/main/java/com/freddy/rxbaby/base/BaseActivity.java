/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.freddy.rxbaby.R;

import butterknife.ButterKnife;

/**
 * Description:
 * Created by freddy on 16/5/20.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public Fragment switchFragment(Class<? extends Fragment> fromFragmentClass, Class<? extends Fragment> toFragmentClass, Bundle args) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        String fromTag = fromFragmentClass.getSimpleName();
        String toTag = toFragmentClass.getSimpleName();
        Fragment fromFragment = fragmentManager.findFragmentByTag(fromTag);
        Fragment toFragment = fragmentManager.findFragmentByTag(toTag);
        if (toFragment == null) {
            try {
                toFragment = toFragmentClass.newInstance();
                toFragment.setArguments(args);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //如果有参数传递，
        if (toFragment != null && args != null && !args.isEmpty()) {
            args.putAll(toFragment.getArguments());
        }
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (toFragment != null && !toFragment.isAdded()) {
            fragmentTransaction.add(R.id.fl_content, toFragment, toTag).hide(fromFragment);
        } else {
            fragmentTransaction.hide(fromFragment).show(toFragment);
        }
        fragmentTransaction.commitAllowingStateLoss();

        return toFragment;
    }
}

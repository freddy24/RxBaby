/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.utils;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Description:
 * Created by freddy on 16/6/2.
 */
public class ActivityUtils {

    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                             @NonNull Fragment fragment, int frameId){
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(frameId, fragment);
        fragmentTransaction.commit();
    }
}

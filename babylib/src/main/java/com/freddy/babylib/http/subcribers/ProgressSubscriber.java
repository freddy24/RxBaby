/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.http.subcribers;

import android.content.Context;

import com.freddy.babylib.http.progress.ProgressCancelListener;
import com.freddy.babylib.http.progress.ProgressDialogHandler;

/**
 * Description: with progress http subscriber
 * Created by freddy on 16/5/18.
 */
public class ProgressSubscriber<BResponse> extends BaseSubscriber<BResponse> implements ProgressCancelListener{

    private Context context;
    private ProgressDialogHandler progressDialogHandler;
    private ProgressCancelListener progressCancelListener;
    private SubscriberOnNextListener onNextListener;

    public ProgressSubscriber(Context context, SubscriberOnNextListener onNextListener){
        this.context = context;
        this.onNextListener = onNextListener;
        progressDialogHandler = new ProgressDialogHandler(context, this, true);
    }

    private void showProgressDialog(){
        if (null != progressDialogHandler){
            progressDialogHandler.obtainMessage(ProgressDialogHandler.SHOW_PROGRESS_DIALOG).sendToTarget();
        }
    }

    private void dismissProgressDialog(){
        if (null != progressDialogHandler){
            progressDialogHandler.obtainMessage(ProgressDialogHandler.DISMISS_PROGRESS_DIALOG).sendToTarget();
            progressDialogHandler = null;
        }
    }
    /**
     * note: this is not in UI Thread
     */
    @Override
    public void onStart() {
        showProgressDialog();
    }

    @Override
    public void onCompleted() {
        dismissProgressDialog();
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);
        dismissProgressDialog();
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onNext(BResponse t) {
        if (onNextListener != null){
            onNextListener.onNext(t);
        }
    }

    @Override
    public void onCancelProgress() {
        if (this.isUnsubscribed()){
            this.unsubscribe();//stop current http
        }
    }
}

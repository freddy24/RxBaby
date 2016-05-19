/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.http.progress;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;

/**
 * Description:
 * Created by freddy on 16/5/18.
 */
public class ProgressDialogHandler extends Handler {

    public static final int SHOW_PROGRESS_DIALOG = 1;
    public static final int DISMISS_PROGRESS_DIALOG = 2;

    private ProgressDialog progressDialog;

    private Context context;
    private ProgressCancelListener cancelListener;
    private boolean cancelable;

    public ProgressDialogHandler(Context context, ProgressCancelListener progressCancelListener, boolean cancelable){
        super();
        this.context = context;
        this.cancelListener = progressCancelListener;
        this.cancelable = true;
    }

    private void initProgressDialog(){
        if (null == progressDialog){
            progressDialog = new ProgressDialog(context);
            progressDialog.setCancelable(cancelable);
            if (cancelable){
                progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialogInterface) {
                        if (null != cancelListener){
                            cancelListener.onCancelProgress();
                        }
                    }
                });
            }

            if (!progressDialog.isShowing()){
                progressDialog.show();
            }
        }
    }

    private void dismissProgressDialog(){
        if (null != progressDialog){
            progressDialog.dismiss();
            progressDialog = null;
        }
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        switch (msg.what){
            case SHOW_PROGRESS_DIALOG:
                initProgressDialog();
                break;
            case DISMISS_PROGRESS_DIALOG:
                dismissProgressDialog();
                break;
        }
    }
}

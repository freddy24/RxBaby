package com.freddy.gogogo.dialog;

import android.app.ProgressDialog;
import android.content.Context;

import com.freddy.babylib.dialog.BaseDialog;
import com.freddy.babylib.dialog.CommonDialog;
import com.freddy.babylib.dialog.DialogClickListener;
import com.freddy.gogogo.R;

/**
 * dialog管理类
 * Created by wujinpeng on 2016/8/12.
 */
public class DialogManager {

    private static DialogManager dialogManager;

    private ProgressDialog mProgressDialog;

    private BaseDialog mDialog;

    private DialogManager(){

    }

    public static DialogManager getInstance(){
        if (null == dialogManager){
            synchronized (DialogManager.class){
                if (null == dialogManager){
                    dialogManager = new DialogManager();
                }
            }
        }
        return  dialogManager;
    }

    /**
     * 两个普通按钮框 取消 确定
     * @param content 中间信息
     * @param clickListener 按钮监听
     */
    public void showCommonDialog(Context context,String content, DialogClickListener clickListener){
        mDialog = new CommonDialog(context, content, clickListener);
        mDialog.show();
    }

    public void showCommonDialog(Context context, String content, String left, String right, DialogClickListener clickListener){
        mDialog = new CommonDialog(context, content, left, right, clickListener);
        mDialog.show();
    }


    public void showProgressDialog(Context context){
        dismissProgressDialog();
        mProgressDialog = new ProgressDialog(context);
        //点击提示框外面是否取消提示框
        mProgressDialog.setCanceledOnTouchOutside(false);
        //点击返回键是否取消提示框
        mProgressDialog.setCancelable(true);
        mProgressDialog.setIndeterminate(true);
        if (mProgressDialog != null || !mProgressDialog.isShowing()){
            mProgressDialog.show();
            mProgressDialog.setContentView(R.layout.progress_layout);
        }
    }

    public void showProgressDialog(Context context,String message){
        showProgressDialog(context);
        mProgressDialog.setMessage(message);
    }

    public void dismissProgressDialog(){
        if (null != mProgressDialog && mProgressDialog.isShowing()){
            mProgressDialog.dismiss();
        }
    }
}

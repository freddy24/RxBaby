package com.freddy.gogogo.dialog;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.freddy.babylib.dialog.BaseDialog;
import com.freddy.babylib.dialog.DialogClickListener;
import com.freddy.gogogo.R;
import com.freddy.gogogo.data.bean.HNumber;

/**
 *
 * Created by wujinpeng on 2016/10/13.
 */
public class InputDialog extends BaseDialog {
    private TextView tvTitle;
    private EditText etMoney;
    TextView tvLeft;
    TextView tvRight;
    private String title;
    private DialogClickListener clickListener;
    /**
     * method execute order:
     * show:constrouctor---show---oncreate---onStart---onAttachToWindow
     * dismiss:dismiss---onDetachedFromWindow---onStop
     *
     * @param context
     */
    public InputDialog(Context context) {
        super(context);
    }

    public InputDialog(Context context, HNumber hNumber, DialogClickListener dialogClickListener){
        super(context);
        this.title = hNumber.getName();
        this.clickListener = dialogClickListener;
        setCancel(false);
    }

    @Override
    public View onCreateView() {
        View view = View.inflate(context, R.layout.input_dialog, null);
        widthScale(0.85f);
        tvTitle = (TextView) view.findViewById(R.id.tv_title);
        tvTitle.setText(title);
        etMoney = (EditText) view.findViewById(R.id.et_money);
        tvLeft = (TextView) view.findViewById(R.id.tv_left);
        tvRight = (TextView) view.findViewById(R.id.tv_right);
        tvLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != clickListener) {
                    clickListener.leftClickListener();
                }
                dismiss();
            }
        });
        tvRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != clickListener) {
                    clickListener.rightClickListener();
                }
            }
        });
        return view;
    }

    public String getInputMoney(){
        return etMoney.getText().toString().trim();
    }

    @Override
    public boolean setUiBeforShow() {
        return false;
    }
}

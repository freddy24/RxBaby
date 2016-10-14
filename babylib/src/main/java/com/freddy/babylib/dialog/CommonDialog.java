package com.freddy.babylib.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.freddy.babylib.R;
import com.freddy.babylib.utils.StringUtil;

import butterknife.ButterKnife;

/**
 * /**
 *
 * @author :wjp
 *         一般的普通框
 *         ---------------------------
 *         |          title          |
 *         |         content         |
 *         ---------------------------
 *         |    left    |    right   |
 *         ---------------------------
 *         Created by wujinpeng on 2016/9/6.
 */
public class CommonDialog extends BaseDialog {
    public static final int DEFAULT_NON_PIC = 0 ;
//    @BindView(R2.id.tv_title)
    TextView tvTitle;
//    @BindView(R2.id.tv_content)
    TextView tvContent;
//    @BindView(R2.id.tv_left)
    TextView tvLeft;
//    @BindView(R2.id.tv_right)
    TextView tvRight;
    ImageView imgContent;
    private String title;
    private String content;
    private String left;
    private String right;
    private int pic = DEFAULT_NON_PIC;

    private DialogClickListener clickListener;

    public CommonDialog(Context context, String content, DialogClickListener clickListener) {
        super(context);
        this.content = content;
        this.clickListener = clickListener;
        setCancel(false);
    }

    public CommonDialog(Context context, String content, DialogClickListener clickListener, int picRes) {
        super(context);
        this.content = content;
        this.clickListener = clickListener;
        this.pic = picRes;
        setCancel(false);
    }

    public CommonDialog(Context context, String content, String right, DialogClickListener clickListener) {
        super(context);
        this.content = content;
        this.right = right;
        this.clickListener = clickListener;
        setCancel(false);
    }

    public CommonDialog(Context context, String content, String right, DialogClickListener clickListener, int picRes) {
        super(context);
        this.content = content;
        this.right = right;
        this.clickListener = clickListener;
        this.pic = picRes;
        setCancel(false);
    }

    public CommonDialog(Context context, String content, String left, String right, DialogClickListener clickListener) {
        super(context);
        this.content = content;
        this.left = left;
        this.right = right;
        this.clickListener = clickListener;
        setCancel(false);
    }

    public CommonDialog(Context context, String content, String left, String right, DialogClickListener clickListener, int picRes) {
        super(context);
        this.content = content;
        this.left = left;
        this.right = right;
        this.clickListener = clickListener;
        this.pic = picRes;
        setCancel(false);
    }

    public CommonDialog(Context context, String title, String content, String left, String right, DialogClickListener clickListener, int picRes) {
        super(context);
        this.title = title;
        this.content = content;
        this.left = left;
        this.right = right;
        this.clickListener = clickListener;
        this.pic = picRes;
        setCancel(false);
    }

    @Override
    public View onCreateView() {
        View view = View.inflate(context, R.layout.common_dialog, null);
        ButterKnife.bind(this, view);
        widthScale(0.85f);
        tvTitle = (TextView) view.findViewById(R.id.tv_title);
        tvTitle.setText(title);
        tvContent = (TextView) view.findViewById(R.id.tv_content);
        tvContent.setText(content);
        tvLeft = (TextView) view.findViewById(R.id.tv_left);
        tvLeft.setText(left);
        tvRight = (TextView) view.findViewById(R.id.tv_right);
        tvRight.setText(right);
        imgContent = (ImageView) view.findViewById(R.id.img_content);
        imgContent.setBackgroundResource(pic);
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
                dismiss();
            }
        });
        return view;
    }

    @Override
    public boolean setUiBeforShow() {
        if (StringUtil.isStringNull(title)) {
            tvTitle.setVisibility(View.GONE);
        }
        if (StringUtil.isStringNull(left) && !StringUtil.isStringNull(right)) {
            tvLeft.setVisibility(View.GONE);
            tvRight.setBackgroundResource(R.drawable.btn_confirm_exit);
        }
        if (pic == DEFAULT_NON_PIC) {
            imgContent.setVisibility(View.GONE);
        }
        if (StringUtil.isStringNull(left) && StringUtil.isStringNull(right)) {
            tvLeft.setText("取消");
            tvRight.setText("确定");
        }
        return true;
    }
}

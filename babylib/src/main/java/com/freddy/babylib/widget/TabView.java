/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.freddy.babylib.R;

/**
 * Description: text with icon at top
 * Created by freddy on 16/6/2.
 */
public class TabView extends TextView {

    private int iconWidth;
    private int iconHeight;

    public TabView(Context context) {
        this(context, null, 0);
    }

    public TabView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TabView, defStyleAttr, 0);
        iconWidth = a.getDimensionPixelOffset(R.styleable.TabView_icon_width, 0);
        iconHeight = a.getDimensionPixelOffset(R.styleable.TabView_icon_height, 0);
        a.recycle();
    }

    public void setIcon(int resId){
        if (resId > 0 ){
            final Resources resources = getContext().getResources();
            Drawable drawable = resources.getDrawable(resId);
            if (drawable != null){
                int width = iconWidth == 0 ? drawable.getIntrinsicWidth() : iconWidth;
                int height = iconHeight == 0 ? drawable.getIntrinsicHeight() : iconHeight;
                drawable.setBounds(0, 0 ,width, height);
                setCompoundDrawables(null, drawable, null, null);
            }

        }
    }

}

package com.freddy.gogogo.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Dragon extends Animal {

    public Dragon() {
        setName("龙");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("5"));
        mHNumberList.add(new HNumber("17"));
        mHNumberList.add(new HNumber("29"));
        mHNumberList.add(new HNumber("41"));
        setNumbers(mHNumberList);
    }
}

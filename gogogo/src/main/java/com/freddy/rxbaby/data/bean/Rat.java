package com.freddy.rxbaby.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Rat extends Animal {

    public Rat() {
        setName("鼠");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("1"));
        mHNumberList.add(new HNumber("13"));
        mHNumberList.add(new HNumber("25"));
        mHNumberList.add(new HNumber("37"));
        mHNumberList.add(new HNumber("49"));
        setNumbers(mHNumberList);
    }
}

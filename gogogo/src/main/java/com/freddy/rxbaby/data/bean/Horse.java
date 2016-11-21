package com.freddy.rxbaby.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Horse extends Animal {

    public Horse() {
        setName("马");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("7"));
        mHNumberList.add(new HNumber("19"));
        mHNumberList.add(new HNumber("31"));
        mHNumberList.add(new HNumber("43"));
        setNumbers(mHNumberList);
    }
}

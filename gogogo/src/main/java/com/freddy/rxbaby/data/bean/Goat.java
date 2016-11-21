package com.freddy.rxbaby.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Goat extends Animal {

    public Goat() {
        setName("羊");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("8"));
        mHNumberList.add(new HNumber("20"));
        mHNumberList.add(new HNumber("32"));
        mHNumberList.add(new HNumber("44"));
        setNumbers(mHNumberList);
    }
}

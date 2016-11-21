package com.freddy.rxbaby.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Monkey extends Animal {

    public Monkey() {
        setName("猴");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("9"));
        mHNumberList.add(new HNumber("21"));
        mHNumberList.add(new HNumber("33"));
        mHNumberList.add(new HNumber("45"));
        setNumbers(mHNumberList);
    }
}

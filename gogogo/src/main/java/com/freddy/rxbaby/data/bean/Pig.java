package com.freddy.rxbaby.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Pig extends Animal {

    public Pig() {
        setName("猪");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("12"));
        mHNumberList.add(new HNumber("24"));
        mHNumberList.add(new HNumber("36"));
        mHNumberList.add(new HNumber("48"));
        setNumbers(mHNumberList);
    }
}

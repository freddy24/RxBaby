package com.freddy.rxbaby.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Rabbit extends Animal {

    public Rabbit() {
        setName("兔");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("4"));
        mHNumberList.add(new HNumber("16"));
        mHNumberList.add(new HNumber("28"));
        mHNumberList.add(new HNumber("40"));
        setNumbers(mHNumberList);
    }
}

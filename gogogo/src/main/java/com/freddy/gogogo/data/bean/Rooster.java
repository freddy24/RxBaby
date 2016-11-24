package com.freddy.gogogo.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Rooster extends Animal {

    public Rooster() {
        setName("鸡");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("10"));
        mHNumberList.add(new HNumber("22"));
        mHNumberList.add(new HNumber("34"));
        mHNumberList.add(new HNumber("46"));
        setNumbers(mHNumberList);
    }
}

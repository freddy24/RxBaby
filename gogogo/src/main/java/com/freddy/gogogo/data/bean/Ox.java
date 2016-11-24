package com.freddy.gogogo.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Ox extends Animal {

    public Ox() {
        setName("牛");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("2"));
        mHNumberList.add(new HNumber("14"));
        mHNumberList.add(new HNumber("26"));
        mHNumberList.add(new HNumber("38"));
        setNumbers(mHNumberList);
    }
}

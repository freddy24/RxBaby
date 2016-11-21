package com.freddy.rxbaby.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Snake extends Animal {

    public Snake() {
        setName("蛇");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("6"));
        mHNumberList.add(new HNumber("18"));
        mHNumberList.add(new HNumber("30"));
        mHNumberList.add(new HNumber("42"));
        setNumbers(mHNumberList);
    }
}

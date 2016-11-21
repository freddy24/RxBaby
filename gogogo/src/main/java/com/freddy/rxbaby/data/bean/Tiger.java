package com.freddy.rxbaby.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Tiger extends Animal {

    public Tiger() {
        setName("虎");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("3"));
        mHNumberList.add(new HNumber("15"));
        mHNumberList.add(new HNumber("27"));
        mHNumberList.add(new HNumber("39"));
        setNumbers(mHNumberList);
    }
}

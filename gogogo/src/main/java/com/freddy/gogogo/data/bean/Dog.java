package com.freddy.gogogo.data.bean;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Dog extends Animal {

    public Dog() {
        setName("狗");
        List<HNumber> mHNumberList = new ArrayList<>();
        mHNumberList.add(new HNumber("11"));
        mHNumberList.add(new HNumber("23"));
        mHNumberList.add(new HNumber("35"));
        mHNumberList.add(new HNumber("47"));
        setNumbers(mHNumberList);
    }
}

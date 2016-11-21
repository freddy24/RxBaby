package com.freddy.rxbaby.data.bean;

import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/18.
 */
public class Animal {

    private String name;

    private List<HNumber> mNumbers;

    private boolean isChoose;

    private double money;

    public Animal(){}

    public Animal(String name, List<HNumber> hNumbers){
        this.name = name;
        this.mNumbers = hNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HNumber> getNumbers() {
        return mNumbers;
    }

    public void setNumbers(List<HNumber> numbers) {
        mNumbers = numbers;
    }

    public boolean isChoose() {
        return isChoose;
    }

    public void setChoose(boolean choose) {
        isChoose = choose;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

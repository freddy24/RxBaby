package com.freddy.gogogo.data.bean;

/**
 *
 * Created by wujinpeng on 2016/10/13.
 */
public class HNumber {
    private String name;
    private double money;
    private boolean isChoose = false;

    public HNumber(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isChoose() {
        return isChoose;
    }

    public void setChoose(boolean choose) {
        isChoose = choose;
    }
}

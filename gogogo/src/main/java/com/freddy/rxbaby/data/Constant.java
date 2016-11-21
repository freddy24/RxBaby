package com.freddy.rxbaby.data;

import com.freddy.rxbaby.data.bean.Animal;
import com.freddy.rxbaby.data.bean.Dog;
import com.freddy.rxbaby.data.bean.Dragon;
import com.freddy.rxbaby.data.bean.Goat;
import com.freddy.rxbaby.data.bean.HNumber;
import com.freddy.rxbaby.data.bean.Horse;
import com.freddy.rxbaby.data.bean.Monkey;
import com.freddy.rxbaby.data.bean.Ox;
import com.freddy.rxbaby.data.bean.Pig;
import com.freddy.rxbaby.data.bean.Rabbit;
import com.freddy.rxbaby.data.bean.Rat;
import com.freddy.rxbaby.data.bean.Rooster;
import com.freddy.rxbaby.data.bean.Snake;
import com.freddy.rxbaby.data.bean.Tiger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/13.
 */
public class Constant {

    public static List<HNumber> hNumbers = new ArrayList<HNumber>(){
        {
            add(new HNumber("1"));
            add(new HNumber("2"));
            add(new HNumber("3"));
            add(new HNumber("4"));
            add(new HNumber("5"));
            add(new HNumber("6"));
            add(new HNumber("7"));
            add(new HNumber("8"));
            add(new HNumber("9"));
            add(new HNumber("10"));
            add(new HNumber("11"));
            add(new HNumber("12"));
            add(new HNumber("13"));
            add(new HNumber("14"));
            add(new HNumber("15"));
            add(new HNumber("16"));
            add(new HNumber("17"));
            add(new HNumber("18"));
            add(new HNumber("19"));
            add(new HNumber("20"));
            add(new HNumber("21"));
            add(new HNumber("22"));
            add(new HNumber("23"));
            add(new HNumber("24"));
            add(new HNumber("25"));
            add(new HNumber("26"));
            add(new HNumber("27"));
            add(new HNumber("28"));
            add(new HNumber("29"));
            add(new HNumber("30"));
            add(new HNumber("31"));
            add(new HNumber("32"));
            add(new HNumber("33"));
            add(new HNumber("34"));
            add(new HNumber("35"));
            add(new HNumber("36"));
            add(new HNumber("37"));
            add(new HNumber("38"));
            add(new HNumber("39"));
            add(new HNumber("40"));
            add(new HNumber("41"));
            add(new HNumber("42"));
            add(new HNumber("43"));
            add(new HNumber("44"));
            add(new HNumber("45"));
            add(new HNumber("46"));
            add(new HNumber("47"));
            add(new HNumber("48"));
            add(new HNumber("49"));
        }
    };

    public static List<Animal> animals = new ArrayList<Animal>(){
        {
            add(new Rat());
            add(new Ox());
            add(new Tiger());
            add(new Rabbit());
            add(new Dragon());
            add(new Snake());
            add(new Horse());
            add(new Goat());
            add(new Monkey());
            add(new Rooster());
            add(new Dog());
            add(new Pig());
        }
    };
}

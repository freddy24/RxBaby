package com.freddy.gogogo.data;

import com.freddy.gogogo.data.bean.Animal;
import com.freddy.gogogo.data.bean.Dog;
import com.freddy.gogogo.data.bean.Dragon;
import com.freddy.gogogo.data.bean.Goat;
import com.freddy.gogogo.data.bean.HNumber;
import com.freddy.gogogo.data.bean.Horse;
import com.freddy.gogogo.data.bean.Monkey;
import com.freddy.gogogo.data.bean.Ox;
import com.freddy.gogogo.data.bean.Pig;
import com.freddy.gogogo.data.bean.Rabbit;
import com.freddy.gogogo.data.bean.Rat;
import com.freddy.gogogo.data.bean.Rooster;
import com.freddy.gogogo.data.bean.Snake;
import com.freddy.gogogo.data.bean.Tiger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by wujinpeng on 2016/10/13.
 */
public class Constant {

    public static final String Rat = "鼠";
    public static final String Ox = "牛";
    public static final String Tiger = "虎";
    public static final String Rabbit = "兔";
    public static final String Dragon = "龙";
    public static final String Snake = "蛇";
    public static final String Horse = "马";
    public static final String Goat = "羊";
    public static final String Monkey = "猴";
    public static final String Rooster = "鸡";
    public static final String DOG = "狗";
    public static final String Pig = "猪";

    public static final String DOUBLE = "boudle";
    public static final String SINGLE = "single";

    public static final String BIG = "big";
    public static final String SMALL = "small";

    public static final String WAVE_RED = "red";
    public static final String WAVE_BLUE = "blue";
    public static final String WAVE_GREEN = "green";

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

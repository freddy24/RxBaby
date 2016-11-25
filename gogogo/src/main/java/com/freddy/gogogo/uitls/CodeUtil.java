package com.freddy.gogogo.uitls;

import com.freddy.gogogo.data.Constant;

/**
 *
 * Created by wujinpeng on 2016/11/25.
 */
public class CodeUtil {

    public static String getAnimal(int index){
        switch (index){
            case 1:
            case 13:
            case 25:
            case 37:
            case 49:
                return Constant.Rooster;
            case 2:
            case 14:
            case 26:
            case 38:
                return Constant.DOG;
            case 3:
            case 15:
            case 27:
            case 39:
                return Constant.Pig;
            case 4:
            case 16:
            case 28:
            case 40:
                return Constant.Rat;
            case 5:
            case 17:
            case 29:
            case 41:
                return Constant.Ox;
            case 6:
            case 18:
            case 30:
            case 42:
                return Constant.Tiger;
            case 7:
            case 19:
            case 31:
            case 43:
                return Constant.Rabbit;
            case 8:
            case 20:
            case 32:
            case 44:
                return Constant.Dragon;
            case 9:
            case 21:
            case 33:
            case 45:
                return Constant.Snake;
            case 10:
            case 22:
            case 34:
            case 46:
                return Constant.Horse;
            case 11:
            case 23:
            case 35:
            case 47:
                return Constant.Goat;
            case 12:
            case 24:
            case 36:
            case 48:
                return Constant.Monkey;
        }
        return "";
    }

    public static String getBigSmall(int index){
        if (index <= 25){
            return Constant.SMALL;
        }else{
            return Constant.BIG;
        }
    }

    public static String getDoubleSingle(int index){
        if (index % 2 == 0){
            return Constant.DOUBLE;
        }else{
            return Constant.SINGLE;
        }
    }

    public static String getWave(int index){
        switch (index){
            case 1:
            case 2:
            case 7:
            case 8:
            case 12:
            case 13:
            case 18:
            case 19:
            case 23:
            case 24:
            case 29:
            case 30:
            case 34:
            case 35:
            case 40:
            case 45:
            case 46:
                return Constant.WAVE_RED;
            case 3:
            case 4:
            case 9:
            case 10:
            case 14:
            case 15:
            case 20:
            case 25:
            case 26:
            case 31:
            case 36:
            case 37:
            case 41:
            case 42:
            case 47:
            case 48:
                return Constant.WAVE_BLUE;
            case 5:
            case 6:
            case 11:
            case 16:
            case 17:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            case 38:
            case 39:
            case 43:
            case 44:
            case 49:
                return Constant.WAVE_GREEN;
        }
        return "";
    }
}

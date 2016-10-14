package com.freddy.babylib.utils;
/**
 * Description:
 * Created by freddy on 16/7/20.
 */
public class StringUtil {

    public static final int BIRTH_YEAR = 1;
    public static final int BIRTH_MONTH = 2;
    public static final int BIRTH_DAY = 3;

    public static boolean isStringNull(String temp) {
        return temp == null || temp.isEmpty() || ("").equals(temp)
                || (" ").equals(temp) || temp.equals("undefined")
                || temp.equals("null");
    }

    /**
     * 字符串为空时替换成默认字符串
     * @param str
     * @param defaultStr
     * @return
     */
    public static String emptyIs(String str, String defaultStr) {
        return isStringNull(str) ? defaultStr : str;
    }

    /**
     * 获取身份证上生日信息
     * @param data 生日信息 eg：19990909
     * @param type Constant.BIRTH_YEAR 年
     * @return 1999 09 09
     */
    public static String formatBirth(String data, int type){
        String value = "";
        if (data !=null && data.length() > 0){
            switch (type){
                case BIRTH_YEAR:
                    value =  data.substring(0,4);
                    break;
                case BIRTH_MONTH:
                    value =  data.substring(4,6);
                    break;
                case BIRTH_DAY:
                    value = data.substring(6,8);
                    break;
            }
        }
        return value;
    }

    public static String formatPeriod(String var1, String var2) {
        String var3 = "";
        if (!isStringNull(var1)){
            var3 = var1.substring(0, 4) + "." + var1.substring(4, 6) + "." + var1.substring(6, 8);
        }
        String var4 = "";
        if (!isStringNull(var2)){
            if(var2.contains("长期")) {
                var4 = var2;
            } else {
                var4 = var2.substring(0, 4) + "." + var2.substring(4, 6) + "." + var2.substring(6, 8);
            }
        }

        return var3 + "-" + var4;
    }
}

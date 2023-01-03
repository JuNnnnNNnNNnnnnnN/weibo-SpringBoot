package com.weibo.utils;

public class StringUtils {

    public static boolean isBlank(String inStr){
        if (inStr == null || inStr.trim().equals("")){
            return true;
        }
        return false;
    }

    public static boolean isNotBlank(String inStr){
        return !isBlank(inStr);
    }
}

package com.weibo.utils;

import com.weibo.entity.Article;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

public class CommonUtil {

    public static String[] getInParamsName(Method inMethod) {
        ArrayList<String> result = new ArrayList<>();
        for (Parameter parameter : inMethod.getParameters()) {
            result.add(parameter.getName());
        }
        return (String[]) result.toArray();

    }

    public String checkParams(Object... inObj) throws Exception {

        ArrayList<String> paramNames = new ArrayList<>();
        Class clazz = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        Method m = clazz.getDeclaredMethod("a");
        for (Parameter parameter : Class.forName(Thread.currentThread().getStackTrace()[2].getClassName())
                .getMethod(Thread.currentThread().getStackTrace()[2].getMethodName()).getParameters()) {
            paramNames.add(parameter.getName());
        }
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < inObj.length; i++) {
            if (inObj[i] == null ||
                    (inObj[i].getClass() == String.class && StringUtils.isBlank(inObj[i].toString()))
            ) {
                result.append(result.toString().equals("") ? paramNames.get(i) : "|" + paramNames.get(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception{
        new CommonUtil().a();
    }

    public void a() throws Exception{
        System.out.println(checkParams("", 0, new Date(), 0x16, new short[10], "abx"));
    }

}

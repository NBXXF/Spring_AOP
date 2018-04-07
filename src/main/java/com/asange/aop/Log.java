package com.asange.aop;

/**
 * com.asange.aop
 * icourt
 * 2018/4/6
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class Log implements Loggable {

    public static final Log log = new Log();

    public static void log(String str) {
        log.d(str);
    }

    @Override
    public void d(String s) {
        System.out.println("============>" + s);
    }
}

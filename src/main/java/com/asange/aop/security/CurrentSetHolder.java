package com.asange.aop.security;

/**
 * com.asange.aop.security
 * icourt
 * 2018/4/6
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class CurrentSetHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get() {
        return holder.get()==null?"unknown":holder.get();
    }

    public static void set(String user) {
        holder.set(user);
    }
}

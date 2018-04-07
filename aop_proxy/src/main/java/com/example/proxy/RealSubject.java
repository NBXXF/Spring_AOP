package com.example.proxy;

/**
 * com.example.proxy
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("========>realSubject request");
    }
}

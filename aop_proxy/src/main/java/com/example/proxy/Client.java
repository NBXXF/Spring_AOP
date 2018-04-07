package com.example.proxy;

/**
 * com.example.proxy
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class Client {

    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }
}

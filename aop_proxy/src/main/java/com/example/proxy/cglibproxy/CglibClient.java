package com.example.proxy.cglibproxy;

import com.example.proxy.RealSubject;
import com.example.proxy.Subject;
import org.springframework.cglib.proxy.Enhancer;

/**
 * com.example.proxy.cglibproxy
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class CglibClient {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new CglibInterceptor());
        Subject subject = (Subject) enhancer.create();
        subject.request();
    }
}

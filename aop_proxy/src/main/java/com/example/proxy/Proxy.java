package com.example.proxy;

/**
 * com.example.proxy
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/

/**
 * 代理对象
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("======>before");
        /**
         * 委托目标对象执行
         */
        try {
            this.realSubject.request();
        } catch (Exception e) {
            System.out.println("======>exception:" + e);
            //代理对象并不会改变这个对象的方法
            throw e;
        } finally {
            System.out.println("======>after");
        }

    }
}

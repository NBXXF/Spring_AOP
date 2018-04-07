package com.example.proxy.jdkproxy;

import com.example.proxy.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * com.example.proxy.jdkproxy
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class JdkProxySubject implements InvocationHandler {

    private RealSubject realSubject;

    public JdkProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            System.out.println("==========>before");
            //用反射动态执行
            return method.invoke(realSubject, args);
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("==========>after");
        }
    }
}

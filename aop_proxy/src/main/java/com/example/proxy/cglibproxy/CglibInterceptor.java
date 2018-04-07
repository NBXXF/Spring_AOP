package com.example.proxy.cglibproxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * com.example.proxy.cglibproxy
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class CglibInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        try {
            System.out.println("========cglib before");
            return methodProxy.invokeSuper(o,args);
        } catch (Throwable e) {
            System.out.println("========cglib exc:"+e);
            throw e;
        }
        finally {
            System.out.println("========cglib after");
        }
    }
}

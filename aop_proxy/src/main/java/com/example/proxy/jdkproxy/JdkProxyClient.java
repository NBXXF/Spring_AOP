package com.example.proxy.jdkproxy;

import com.example.proxy.RealSubject;
import com.example.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * com.example.proxy.jdkproxy
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class JdkProxyClient {

    public static void main(String[] args) {
        //生成$Proxy0的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Subject subject= (Subject) Proxy.newProxyInstance(
                JdkProxyClient.class.getClassLoader(),
                new Class[]{Subject.class},
                new JdkProxySubject(new RealSubject()));
        subject.request();
    }
}

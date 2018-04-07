package com.asange.aop.execution;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * com.asange.aop.execution
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
@Service
public class ExecutionService {

    public void sayHello() {
        System.out.println("========>hello");
    }

    public void sayHello(String str) {
        System.out.println("========>"+str);
    }
}

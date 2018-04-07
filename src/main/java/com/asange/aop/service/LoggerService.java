package com.asange.aop.service;

import com.asange.aop.Loggable;
import org.springframework.stereotype.Component;

/**
 * com.asange.aop.service
 * icourt
 * 2018/4/6
 * author:asange
 * email:xuanyouwu@163.com
 **/
@Component
public class LoggerService implements Loggable {
    @Override
    public void d(String s) {
        System.out.println("===================>" + s);
    }
}

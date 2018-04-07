package com.asange.aop.service;

import com.asange.aop.Log;
import com.asange.aop.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * com.asange.aop.service
 * icourt
 * 2018/4/6
 * author:asange
 * email:xuanyouwu@163.com
 **/
@Service
public class ProductService3 implements Loggable {

    @Autowired
    AuthService authService;

    public void insert() {
        d("insert success");
    }

    public void delete(String id) {
        d("delete success id:" + id);
    }

    @Override
    public void d(String s) {
        System.out.println("=========>" + s);
    }
}

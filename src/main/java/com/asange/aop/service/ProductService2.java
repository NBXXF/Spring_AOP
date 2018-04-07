package com.asange.aop.service;

import com.asange.aop.security.AdminOnly;
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
public class ProductService2 {

    @Autowired
    AuthService authService;

    @AdminOnly
    public void insert() {
        System.out.println("insert success");
    }

    @AdminOnly
    public void delete(String id) {
        System.out.println("delete success id:" + id);
    }
}

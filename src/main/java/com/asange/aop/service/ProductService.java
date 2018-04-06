package com.asange.aop.service;

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
public class ProductService {

    @Autowired
    AuthService authService;

    public void insert() {
        authService.checkPermission();
        System.out.println("insert success");
    }

    public void delete(String id) {
        authService.checkPermission();
        System.out.println("delete success id:" + id);
    }
}

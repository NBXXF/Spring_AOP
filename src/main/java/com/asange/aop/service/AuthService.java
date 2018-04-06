package com.asange.aop.service;

import com.asange.aop.security.CurrentSetHolder;
import org.springframework.stereotype.Component;

/**
 * com.asange.aop.service
 * icourt
 * 2018/4/6
 * author:asange
 * email:xuanyouwu@163.com
 **/
@Component
public class AuthService {
    public static void checkPermission() {
        if (!"admin".equals(CurrentSetHolder.get())) {
            throw new RuntimeException("no permission");
        }
    }
}

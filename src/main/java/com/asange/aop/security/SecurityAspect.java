package com.asange.aop.security;

import com.asange.aop.Log;
import com.asange.aop.service.AuthService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * com.asange.aop.security
 * icourt
 * 2018/4/6
 * author:asange
 * email:xuanyouwu@163.com
 **/
@Aspect
@Component
public class SecurityAspect {
    @Autowired
    AuthService authService;

    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly() {
    }

    /**
     * 匹配ProductService类里面的所有方法
     */
    @Pointcut("within(com.asange.aop.service.ProductService3)")
    public void adminService() {
    }

    /**
     * 匹配 com.asange.aop.service包及子包下所有类的方法
     */
    @Pointcut("within(com.asange.aop.service.*)")
    public void adminService2() {
    }


    @Before("adminOnly()")
    public void check() {
        authService.checkPermission();
    }

    @Before("adminService()")
    public void checkClass() {
        authService.checkPermission();
    }


    /**
     * 匹配AOP对象的目标对象为指定类型的方法,即UserDao的aop代理对象的方法】
     */
    @Pointcut("this(com.asange.aop.dao.UserDao)")
    public void thisDao() {

    }

    /**
     * 匹配IUserDao接口的目标对象(而不是aop代理后的对象)的方法,这里即UserDao
     */
    @Pointcut("target(com.asange.aop.dao.IUserDao)")
    public void targetDao() {
    }

    /**
     * 匹配所有以Service结尾的bean里面的方法
     */
    @Pointcut("bean(*Service)")
    public void beanDemo() {
    }

    @Pointcut("target(com.asange.aop.Loggable)")
    public void log() {
    }

    @Pointcut("this(com.asange.aop.Loggable)")
    public void log2() {
    }

    @Before("log()")
    public void logBefore() {
        Log.log("------------>logBefore");
    }
    @Before("log2()")
    public void logBefore2() {
        Log.log("---------------------->logBefore");
    }
}

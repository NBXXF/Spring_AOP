package com.asange.aop.match_param;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * com.asange.aop.match_param
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
@Aspect
@Component
public class MatchAspect {


    /**
     * 匹配任何以find开头并且只有一个Long参数的方法
     *//*
    @Pointcut("execution(* *..find*(Long))")
    public void argsDemo1() {

    }

    *//**
     * 匹配任何只有一个Long参数的方法
     *//*
    @Pointcut("args(Long)")
    public void argsDemo2() {

    }

    *//**
     * 匹配任何以find开头的并且第一个参数为Long型的方法
     *//*
    @Pointcut("execution(* *..find*(Long,..))")
    public void argsDemo3() {
    }

    */

    /**
     * 匹配第一个参数为Long型的方法
     *//*
    @Pointcut("args(Long,..)")
    public void argsDemo4() {

    }
*/
    @Pointcut("args(Long)&& within(com.asange.aop.match_param.MatchParamService)")
    public void argsMatchs() {
    }

    @Before("argsMatchs()")
    public void argsMatchsBind() {
        System.out.println("\n==========只有一个Long参数的方法执行了\n");
    }

    @Pointcut("args(Long,..)&& within(com.asange.aop.match_param.MatchParamService)")
    public void argsMatchs2() {
    }

    @Before("argsMatchs()")
    public void argsMatchsBind2() {
        System.out.println("\n==========带Long参数的方法执行了\n");
    }
}

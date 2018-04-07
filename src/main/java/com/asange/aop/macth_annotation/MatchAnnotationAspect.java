package com.asange.aop.macth_annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * com.asange.aop.macth_annotation
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
@Aspect
@Component
public class MatchAnnotationAspect {

   /* *//**
     * 匹配方法标注有AdminOnly的注解的方法
     *//*
    @Pointcut("@annotation(com.asange.aop.security.AdminOnly)")
    public void annoDemo() {
    }

    *//**
     * 匹配标注有Beta的类底下的方法,要求的annotation的RetentionPolcy级别为Class
     *//*
    @Pointcut("@within(com.google.common.annotations.beta)")
    public void annoWithinDemo() {
    }

    *//**
     * 匹配标注有repository的类底下的方法,要求annotation的RetentionPolicy级别为RUNTIME
     *//*
    @Pointcut("@target(org.springframework.stereotype.Repository)")
    public void annoTargetDemo() {
    }

    *//**
     * 匹配传入的参数类标注有Repository注解的方法
     *//*
    @Pointcut("@args(org.springframework.stereotype.Repository)")
    public void annoArgsDemo() {

    }*/
}

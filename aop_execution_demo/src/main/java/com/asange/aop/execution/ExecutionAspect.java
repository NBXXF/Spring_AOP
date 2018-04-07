package com.asange.aop.execution;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * com.asange.aop.execution
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
@Aspect
@Component
public class ExecutionAspect {
/*    @Pointcut("execution(public * *(..)) && within(ExecutionService)")
    public void executiondemo() {
    }

    @Before("executiondemo()")
    public void executionBind() {
        System.out.println("========>execution(* *(..))");
    }*/

    @Pointcut("execution(* *(String)) && within(ExecutionService)")
    public void executiondemo2() {
    }

    @Before("executiondemo2()")
    public void executionBind2() {
        System.out.println("========>execution(* *(String))");
    }
}

package com.kevin.aopSchema;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Kevin on 2020/10/8
 */
public class TwoLearnAopSchema {

    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs().length);
        System.out.println("前置通知");
    }

    public void aftereturn(JoinPoint joinPoint, Object res) {
        System.out.println(joinPoint.getArgs().length);
        System.out.println("后置通知");
        System.out.println("res" + res);
    }

    public void around(ProceedingJoinPoint jp) {
        try {
            Object res = jp.proceed();
            System.out.println("fhz:" + res);
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
    }
}

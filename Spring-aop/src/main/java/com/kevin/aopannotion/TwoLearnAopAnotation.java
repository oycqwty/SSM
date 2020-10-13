package com.kevin.aopannotion;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Kevin on 2020/10/8
 */
//@Aspect
//@Component
public class TwoLearnAopAnotation {

    @Before("execution(public void com.kevin.dao.TwoLearnStuDao.testAopBeforeMethod(String,int))")
    public void Before(JoinPoint joinPoint) {
        System.out.println("[注解]前置通知");
        String name = joinPoint.getSignature().getName();
        System.out.println("方法名:" + name);
        int length = joinPoint.getArgs().length;
        System.out.println("参数个数:" + length);
        Object instance = joinPoint.getThis();
        System.out.println("目标对象" + instance);
    }

    @AfterReturning(value = "execution(public String com.kevin.dao.TwoLearnStuDao.testAopAfterReturn(String,int))", returning = "res")
    public void after(JoinPoint joinPoint, Object res) {
        System.out.println("后置通知获取返回结果:" + res);
    }

    @Around("execution(public void com.kevin.dao.TwoLearnStuDao.testAopAround(String,int))")
    public void testAopAround(ProceedingJoinPoint jp) {
        try {
            Object result = jp.proceed();
            System.out.println("环绕通知返回结果:" + result);
        } catch (Throwable throwable) {
            System.out.println("异常信息" + throwable.getMessage());
        }
    }

    @AfterThrowing(value = "execution(public void com.kevin.dao.TwoLearnStuDao.ex())", throwing = "exception")
    public void testThrow(Exception exception) {
        System.out.println(exception.getMessage());
    }

}

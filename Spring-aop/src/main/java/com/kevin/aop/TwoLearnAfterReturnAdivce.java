package com.kevin.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Kevin on 2020/10/8
 */
public class TwoLearnAfterReturnAdivce implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object instance) throws Throwable {
        System.out.println("执行后置通知的方法名" + method.getName());
        System.out.println("执行后置通知的对象方法参数列表" + objects.length);
        System.out.println("执行后前置通知的目标方法对象" + instance.getClass());
//        System.out.println("返回值:"+o);
        System.out.println("返回值:" + returnValue);
    }
}

package com.kevin.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Kevin on 2020/10/8
 */
public class TwoLearnBefore implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("执行前置通知的方法名" + method.getName());
        System.out.println("执行前置通知的对象方法参数列表" + objects.length);
        System.out.println("执行前置通知的目标方法对象" + o.getClass());
    }
}

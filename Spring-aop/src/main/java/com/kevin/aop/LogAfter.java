package com.kevin.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by Kevin on 2020/10/3
 */
public class LogAfter implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object instance) throws Throwable {
        System.out.println("后置---方法名: " + method.getName() + " " + "参数个数：" + args.length + "实例:" + instance.getClass());
    }
}

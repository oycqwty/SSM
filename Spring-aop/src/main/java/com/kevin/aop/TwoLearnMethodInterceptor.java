package com.kevin.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Kevin on 2020/10/8
 */
public class TwoLearnMethodInterceptor implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        try {
            //获取方法执行返回值
            Object result = methodInvocation.proceed();
            int count = methodInvocation.getArguments().length;
            System.out.println("环绕通知获取方法参数个数" + count);
            System.out.println("环绕通知获取方法执行返回值" + result);
            Object instance = methodInvocation.getThis();
            System.out.println("环绕通知获取目标对象" + instance);
            return result;
        } catch (Throwable throwable) {
            System.out.println("环绕通知获得异常信息:" + throwable.getMessage());
        }
        return null;
    }
}

package com.kevin.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Kevin on 2020/10/3
 */
public class LogAround implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object result = null;
        System.out.println("环绕通知的前置通知");
        try {
            result = methodInvocation.proceed();
            System.out.println("环绕通知执行");
            System.out.println("当前执行环绕的实例" + methodInvocation.getThis() +
                    "方法名：" + methodInvocation.getMethod().getName() +
                    "参数个数:" + methodInvocation.getArguments().length);
            System.out.println("环绕通知的后置通知");
        } catch (Throwable throwable) {
            System.out.println("环绕通知的异常通知:" + throwable.getMessage());
        }
        System.out.println("环绕通知返回结果:" + result);
        return result;
    }
}

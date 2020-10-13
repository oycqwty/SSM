package com.kevin.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.ThrowsAdvice;

/**
 * Created by Kevin on 2020/10/8
 */
public class TwoLearnThrowadvice implements ThrowsAdvice {

    public void afterThrowing(Exception exception) {
        System.out.println("异常通知");
    }

}

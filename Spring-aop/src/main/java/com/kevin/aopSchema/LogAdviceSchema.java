package com.kevin.aopSchema;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Kevin on 2020/10/3
 */

/**
 * @Description: Schema配置
 * @Param:
 * @Author: Kevin
 * @Date: 2020/10/3
 */
public class LogAdviceSchema {

    public void Before() {
        System.out.println("Schema配置的前置通知");
    }

    public void After(JoinPoint joinPoint, Object returnValue) {
        System.out.println("获取增强对象的方法名:" + joinPoint.getSignature().getName());
        System.out.println(joinPoint.getSignature().getName() + "执行返回结果为:" + returnValue);
    }

    public void around(ProceedingJoinPoint joinPoint) {
        try {
            Object result = joinPoint.proceed();
            System.out.println("执行的返回结果:" + result);
        } catch (Throwable throwable) {
            System.out.println("异常信息:" + throwable.getMessage());
        }
    }

}

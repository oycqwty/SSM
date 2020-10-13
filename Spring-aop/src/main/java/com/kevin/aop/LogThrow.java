package com.kevin.aop;

//import org.springframework.aop.ThrowsAdvice;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by Kevin on 2020/10/3
 */
public class LogThrow implements ThrowsAdvice {

    public void afterThrowing(Exception ex) {
        ex.printStackTrace();
        System.out.println("执行后置：" + ex.getMessage());
    }
}

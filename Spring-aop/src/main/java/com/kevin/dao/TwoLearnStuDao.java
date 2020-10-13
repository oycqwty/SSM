package com.kevin.dao;

import org.springframework.stereotype.Component;

/**
 * Created by Kevin on 2020/10/8
 */

@Component("TwoLearnStuDao")
public class TwoLearnStuDao {

    //前置
    public void testAopBeforeMethod(String s, int i) {
        System.out.println("=======目标方法执行==========");
    }

    //后置
    public String testAopAfterReturn(String s, int i) {
        System.out.println("=======目标方法执行==========");
        return "靓仔";
    }

    //环绕
    public String testAopAround(String s, int i) {
//        int ii = 1/0;
        System.out.println("=======目标方法执行==========");
        return "靓仔hhh";
    }

    //异常
    public void ex() {
        System.out.println(1 / 0);
    }
}

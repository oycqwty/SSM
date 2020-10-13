package com.kevin.dao;

/**
 * Created by Kevin on 2020/10/2
 */
//@Repository("stuimpl")
public class StudentDaoImpl implements StudentDao {
    public void T(String s) {
        s = "哈哈哈";
        System.out.println(s);
        try {
            int i = 1 / 0;
        } catch (Exception e) {

        }
    }

    public String TT() {
        return "靓仔";
    }

    public void testAnnotion() {
        System.out.println("测试注解形式通知");
    }

    public String testAnnotionReturning() {
        return "test get aspectj returnvalue";
    }

    public void testThrow() {
        System.out.println("测试异常");
        int[] a = new int[1];
        a[11] = 1;
    }

    public void testAround() {
        System.out.println("测试异常");
        int i = 1 / 0;
    }
}

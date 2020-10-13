package com.kevin.web.Model;

/**
 * Created by Kevin on 2020/10/5
 */
public class BeanLifeCycle {
    private String username;
    private int age;

    public void init() {
        System.out.println("Bean初始化，执行init");
    }

    public void destory() {
        System.out.println("Bean销毁，执行destory");
    }

    public BeanLifeCycle() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "BeanLifeCycle{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public BeanLifeCycle(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

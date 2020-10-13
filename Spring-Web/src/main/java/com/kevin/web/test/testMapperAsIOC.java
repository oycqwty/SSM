package com.kevin.web.test;

import com.kevin.web.dao.TestAutowiredModel;
import com.kevin.web.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * Created by Kevin on 2020/10/8
 */
public class testMapperAsIOC {

    @Autowired
    @Qualifier("usermapper")
    public UserMapper userMapper1;

    @Autowired
    private TestAutowiredModel autowiredModel;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("usermapper");
        System.out.println(userMapper);
        System.out.println(new testMapperAsIOC().t());
    }

    public UserMapper t() {
        return this.userMapper1;
    }
}

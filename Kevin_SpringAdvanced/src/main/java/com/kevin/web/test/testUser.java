package com.kevin.web.test;

import com.kevin.web.Model.FactoryBeanModel;
import com.kevin.web.Model.User;
import com.kevin.web.config.BeanConfig;
import com.kevin.web.config.MyFactoryBean;
import com.kevin.web.dao.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Kevin on 2020/10/5
 */

public class testUser {
    public static void main(String[] args) {
        testAnnotation();
//        testXml();
    }

    public static void testAnnotation() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
//        User user = (User)ac.getBean("myUser");
//        User user1 = (User)ac.getBean("myUser");
//        UserMapper mapper = (UserMapper)ac.getBean("userMapper");
//            Student student = (Student)ac.getBean("stu");
        FactoryBeanModel model = (FactoryBeanModel) ac.getBean("MyFactoryBean");
        MyFactoryBean model1 = (MyFactoryBean) ac.getBean("&MyFactoryBean");
        System.out.println(model);
        System.out.println(model1);
//        System.out.println(user.getUsername());
//        String[] definitionNames = ac.getBeanDefinitionNames();
//        for (String name : definitionNames) {
//            System.out.println(name);
//        }
//        System.out.println(user==user1);
    }

    public static void testXml() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("myUser");
        UserMapper mapper = (UserMapper) ac.getBean("userMapper");
//        System.out.println(user.getUsername());
        String[] definitionNames = ac.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}

package com.kevin.web.test;

import com.kevin.web.config.BeanConfig;
import com.kevin.web.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by Kevin on 2020/10/5
 */
public class testAnnotationConfigApplicationContext {


    public void XmlBeanlifeCycle() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

//        BeanLifeCycle beanLifeCyclen = (BeanLifeCycle) context.getBean("lifecycle");
//        String username = beanLifeCyclen.getUsername();
//        BeanLifeCycle jsrBean = (BeanLifeCycle) context.getBean("beanJsr250");
//        System.out.println(username);
//        User user = (User)context.getBean("myUser");
//        System.out.println(user.getUsername());
//        BeanLifeCycle lifecycle = (BeanLifeCycle)context.getBean("lifecycle");
//        UserService userService  = (UserService) context.getBean("userService");
//        System.out.println(userService.getUserMapper());
//        context.close();
    }

    public static void AnnotionBeanLifeCycle() {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContextTest.xml");
//        BeanLifeCycle bly = (BeanLifeCycle) context.getBean("BeanLifeCycle");
//        System.out.println(bly.getUsername());
//        UserController userController  = (UserController) context.getBean("userController");
//        System.out.println(userController.getUserService());
//        GetSpringContextComponent contextComponent  = (GetSpringContextComponent) context.getBean("getSpringContextComponent");
//        System.out.println(context==contextComponent.getContext());

    }

    public static void main(String[] args) {
        new testAnnotationConfigApplicationContext().XmlBeanlifeCycle();
//        new testAnnotationConfigApplicationContext().AnnotionBeanLifeCycle();
//        AnnotionBeanLifeCycle();
    }

    /**
     * @Description: 数据源切换
     * @Param:
     * @Author: Kevin
     * @Date: 2020/10/6
     */
    private static void BeanToProfile() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = (ConfigurableEnvironment) context.getEnvironment();
        environment.setActiveProfiles("myapple");
        context.register(BeanConfig.class);
        context.refresh();
        Object appple = context.getBean("apple");
        System.out.println(appple);
        context.close();
    }


}

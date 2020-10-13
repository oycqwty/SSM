package com.kevin.test;

import com.kevin.config.BeanContext;
import com.kevin.dao.TwoLearnStuDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Kevin on 2020/10/8
 */
public class TwoLearnAopTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("TwoLearn-aplicationContext.xml");
        TwoLearnStuDao stu = (TwoLearnStuDao) context.getBean("TwoLearnStuDao");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanContext.class);
//        TwoLearnStuDao stu = (TwoLearnStuDao)context.getBean("TwoLearnStuDao");
//        测试前置
//        stu.testAopBeforeMethod("",1);
//        后置
        stu.testAopAfterReturn("1", 1);
//        环绕
//        stu.testAopAround("",1);
//        异常
//        stu.ex();
    }
}

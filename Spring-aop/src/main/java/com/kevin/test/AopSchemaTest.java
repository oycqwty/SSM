package com.kevin.test;

import javafx.util.Builder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Kevin on 2020/10/3
 */
public class AopSchemaTest {
    public static void main(String[] args) {
        schema();
    }

    public static void schema() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
        Business bs = (Business) context.getBean("Business");
//        bs.testSchema();
//        bs.M();
        bs.testAround();
    }
}

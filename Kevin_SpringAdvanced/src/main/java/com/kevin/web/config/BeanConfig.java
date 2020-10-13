package com.kevin.web.config;

import com.kevin.web.Model.*;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.*;

/**
 * Created by Kevin on 2020/10/5
 *
 * @ComponentScan(value = {"com.kevin.web"},excludeFilters ={
 * @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Service.class)
 * })
 */

@Configuration
@ComponentScan(value = {"com.kevin.web"})
@Import(value = {testImportModel.class})
public class BeanConfig {

    @Bean
//    @Scope("singleton")
    @Scope("prototype")
    @Lazy
    public User myUser() {
        return new User("zhouzhou", 22);
    }

//    @Bean("stu")
//    @Conditional(StudentConditional.class)
//    public sClass autowired(){
//        return new Student();
//    }
//    @Bean("stu1")
//    @Conditional(Student1Conditional.class)
//    public sClass autowired1(){
//        return new Student1();
//    }
//    @Bean
//    public FactoryBean<FactoryBeanModel> MyFactoryBean(){
//        return new MyFactoryBean();
//    }

//    @Bean(value = "lifecycle",initMethod = "init",destroyMethod = "destory")
//    public BeanLifeCycle addIOC(){
//        return new BeanLifeCycle("zhouhzou", 22);
//    }

    @Bean
    @Profile("myapple")
    public Apple apple() {
        return new Apple();
    }

    @Bean
    @Profile("myorange")
    public Orange orange() {
        return new Orange();
    }
}

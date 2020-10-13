package com.kevin.web.component;

import com.kevin.web.Model.Student;
import com.kevin.web.Model.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by Kevin on 2020/10/5
 */

@Component
public class BeanPostProcessComponent implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("初始化"+beanName+": "+bean);
//        此处可以修改任意对象，也可以偷梁换柱
        if (bean instanceof User) {
            User user = (User) bean;
            user.setUsername("靓仔");
            return user;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("销毁"+beanName+": "+bean);
        return bean;
    }
}

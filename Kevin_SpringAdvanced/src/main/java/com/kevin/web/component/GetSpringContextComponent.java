package com.kevin.web.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Kevin on 2020/10/6
 */
@Component
public class GetSpringContextComponent implements ApplicationContextAware, BeanNameAware {
    private ApplicationContext context;
    private String beanName;

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //IOC容器对象 通过get各个组件都可以获取
        this.context = applicationContext;
        System.out.println("实现Aware接口获取IOC容器，在 new ApplicationContext实现类之前执行");
    }

    @Override
    public void setBeanName(String beanName) {
        //获取的是当前组件的名字 id首字母小写
        this.beanName = beanName;
    }
}

package com.kevin.web.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Kevin on 2020/10/6
 */

/**
 * @Description: 拦截到整个IOC容器
 * @Param:
 * @Author: Kevin
 * @Date: 2020/10/6
 */
@Component
public class BeanFactoryPostProcessorComponent implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor阶段-拦截到整个IOC容器");
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("注册Bean的数量:" + beanDefinitionCount);
    }
}

package com.kevin.web.component;

/**
 * Created by Kevin on 2020/10/6
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Param:
 * @Author: Kevin
 * @Date: 2020/10/6
 */
@Component
public class BeanDefRegisterPostProComponent implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        System.out.println("BeanDefRegisterPostProComponent阶段");
        List<String> list = Arrays.asList(beanDefinitionNames);
        System.out.println("容器中已经注册的Bean" + list);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("继承了父接口BeanFactoryPostProcessor的方法，在这里先执行");
    }
}
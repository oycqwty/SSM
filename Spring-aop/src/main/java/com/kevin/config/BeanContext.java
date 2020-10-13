package com.kevin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Kevin on 2020/10/8
 */
@Configuration
@ComponentScan(basePackages = {"com.kevin"})
@EnableAspectJAutoProxy
public class BeanContext {

}

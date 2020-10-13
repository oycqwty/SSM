package com.kevin.web.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Kevin on 2020/10/5
 */

/**
 * @Description: 自定义组件的初始化
 * @Param:
 * @Author: Kevin
 * @Date: 2020/10/6
 */
//@Component
public class JSR250Component {

    @PostConstruct
    public void init() {
        System.out.println("Bean组件初始化操作....");
    }

    @PreDestroy
    public void destory() {
        System.out.println("Bean组件销毁操作....");
    }
}

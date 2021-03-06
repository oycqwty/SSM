package com.kevin.web.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.lang.annotation.Annotation;

/**
 * Created by Kevin on 2020/10/5
 */
public class StudentConditional implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取环境
        Environment environment = conditionContext.getEnvironment();
        String property = environment.getProperty("sClass.type");
        //添加环境参数-D固定 k=v
        //点击Run-->edit Configurations-->添加参数-DsClass.type=stu
        if (property.equals("stu")) {
            return true;
        }
        return false;
    }
}

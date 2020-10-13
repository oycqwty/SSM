package com.kevin.web.config;

import com.kevin.web.Model.FactoryBeanModel;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Kevin on 2020/10/5
 */
public class MyFactoryBean implements FactoryBean<FactoryBeanModel> {
    @Override
    public FactoryBeanModel getObject() throws Exception {
        return new FactoryBeanModel();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanModel.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}

package com.kevin.web.component;

import com.kevin.web.Model.User;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Kevin on 2020/10/5
 */
@Component("InitAndDispos")
public class InitlizerBeanAndDisposableBean implements InitializingBean, DisposableBean {

    @Autowired
    GetSpringContextComponent getSpringContextComponent;

    @Override
    public void afterPropertiesSet() throws Exception {
        ApplicationContext context = this.getSpringContextComponent.getContext();
        User user = (User) context.getBean("myUser");
        System.out.println(user.getUsername());
        System.out.println("InitializingBean控制init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean控制销毁");
    }
}

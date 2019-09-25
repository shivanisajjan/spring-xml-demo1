package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        BeanLifecycleDemoBean bean=context.getBean("beanlifecycle",BeanLifecycleDemoBean.class);
        bean.display();
        context.registerShutdownHook();
    }
}

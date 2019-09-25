package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        BeanLifecycleDemoBean b=context.getBean("beanlifecycle", BeanLifecycleDemoBean.class);
        b.display();
        context.registerShutdownHook();
    }
}

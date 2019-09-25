package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component("beanlifecycle")
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String p;
    @Value("Hi Shivani")
    public void setP(String p) {
        this.p = p;
        System.out.println("Properties set successfully");
    }
    public void display(){
        System.out.println(this.p+"Welcome to Stackroute");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After property set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean");
    }
    @PostConstruct
    public void customInit(){
        System.out.println("Custom Initializing");
    }
    @PreDestroy
    public void customDestroy(){
        System.out.println("Custom Destroy");
    }
}

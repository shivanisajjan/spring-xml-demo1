package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Movie1 implements BeanFactoryAware, BeanNameAware {
    Actor actor;
    private BeanFactory context = null;
    @Autowired
    @Qualifier("actor2")
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor(){
        return this.actor;
    }

    public Actor getactor1() {
        return context.getBean("actor2", Actor.class);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.context=beanFactory;
    }
    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is: "+s+"(Using BeanFactory)");
    }

}

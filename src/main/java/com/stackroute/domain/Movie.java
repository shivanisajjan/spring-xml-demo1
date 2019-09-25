package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware , BeanNameAware {
    Actor actor;
    private ApplicationContext context = null;
    @Autowired
    @Qualifier("actor1")
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor(){
        return this.actor;
    }

    public Actor getactor() {
        return context.getBean("actor1", Actor.class);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is: "+s+"(ApplicationContext)");
    }
}

package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    Actor actor;
    @Autowired
    @Qualifier("actor2") //Gives error if removed because it uses autowire byType (default)
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void actordisplay(){
        actor.display();
    }
}

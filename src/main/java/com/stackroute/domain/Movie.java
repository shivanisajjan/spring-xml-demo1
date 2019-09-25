package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Movie {
    Actor actor;
    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void actordisplay(){
        actor.display();
    }
}

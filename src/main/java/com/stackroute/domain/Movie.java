package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }
    
    public void actordisplay(){
        actor.display();
    }
}

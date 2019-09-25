package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class MovieConfig {
    @Bean
    @Scope("prototype")
    public Actor actor1(){
        return new Actor("Shivani",21,"Female");
    }
    @Bean
    @Scope("prototype")
    public Actor actor2(){
        return new Actor("Haripriya",21,"Female");
    }
    @Bean
    @Scope("prototype")
    public Actor actor3(){
        return new Actor("Deepak",21,"Male");
    }
}

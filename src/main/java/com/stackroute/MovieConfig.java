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
    public Actor actor1(){
        return new Actor("Shivani",21,"Female");
    }
    @Bean
    public Actor actor2(){
        return new Actor("Haripriya",21,"Female");
    }
    @Bean
    public Actor actor3(){
        return new Actor("Deepak",21,"Male");
    }
//    @Bean
//    public Movie movie1(){
//        return new Movie(actor1());
//    }
//    @Bean
//    @Scope("prototype")
//    public Movie movie2(){
//        return new Movie(actor2());
//    }
//    @Bean(name = {"movie3","movie4"})
//    public Movie movie3(){
//        return new Movie(actor3());
//    }
}

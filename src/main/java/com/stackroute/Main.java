package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie1=context.getBean("movie1", Movie.class);
        Movie movie2=context.getBean("movie1", Movie.class);
        if(movie1==movie2)
            System.out.println("Using Singleton:Equal");
        else
            System.out.println("Using Singleton:Not Equal");

        Movie movie3=context.getBean("movie2", Movie.class);
        Movie movie4=context.getBean("movie2", Movie.class);
        if(movie3==movie4)
            System.out.println("Using Prototype:Equal");
        else
            System.out.println("Using Prototype:Not Equal");

        Movie movie5=context.getBean("movie3", Movie.class);
        movie5.actordisplay();
        Movie movie6=context.getBean("movie4", Movie.class);
        movie6.actordisplay();
    }
}

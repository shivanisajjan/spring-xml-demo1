package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        BeanFactory beanFactory=context;
        Movie movie=beanFactory.getBean("movie", Movie.class);
        System.out.println("Using BeanFactory");
        movie.actordisplay();
        System.out.println("-----------------------------------");

        Movie movie1=context.getBean("movie", Movie.class);
        System.out.println("Using ApplicationContext");
        movie1.actordisplay();
    }
}

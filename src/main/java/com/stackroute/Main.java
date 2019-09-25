package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import com.stackroute.domain.Movie1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie1 = context.getBean("movie", Movie.class);
        System.out.println("without ApplicationContextAware:"+movie1);
        Actor actor=movie1.getactor();
        System.out.println("with ApplicationContextAware:"+actor);
        Movie movie2 = context.getBean("movie", Movie.class);
        System.out.println("without ApplicationContextAware:"+movie2);
        Actor actor1=movie2.getactor();
        System.out.println("with ApplicationContextAware:"+actor1);

        System.out.println("--------------------------------------------------------------------------");
        BeanFactory b=context;
        Movie1 movie3 = context.getBean("movie1", Movie1.class);
        System.out.println("Without BeanFactoryAware:"+movie3);
        Actor actor2=movie3.getactor1();
        System.out.println("with BeanFactoryAware:"+actor2);
        Movie1 movie4 = context.getBean("movie1", Movie1.class);
        System.out.println("without BeanFactoryAware:"+movie4);
        Actor actor4=movie3.getactor1();
        System.out.println("with ApplicationContextAware:"+actor4);
    }
}

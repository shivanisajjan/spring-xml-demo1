package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
    String name;
    Integer age;
    String gender;

    @Value("Shivani")
    public void setName(String name) {
        this.name = name;
    }

    @Value("21")
    public void setAge(Integer age) {
        this.age = age;
    }
    @Value("Female")
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void display(){
        System.out.println("Actor Details");
        System.out.println("Name:"+this.name);
        System.out.println("Gender:"+this.gender);
        System.out.println("Age:"+this.age);
    }
}

package com.stackroute;

import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute.demo")
public class MovieConfig {
    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean(){
        return new BeanPostProcessorDemoBean();
    }
}

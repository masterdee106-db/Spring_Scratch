package com.spring.javabaseConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration_Bean
{
//    @Bean is used in a @Configuration class to explicitly define
//    a Spring-managed object when you want full
//    control over bean creation
//    (for third-party classes, custom initialization, or complex setup).
    @Bean(name = "tab")
    public Tablet getTabelet(){
        Tablet tab= new Tablet();
        return tab;
    }
//    @Bean is used to declare a bean in Java-based Spring configuration,
//    especially when the class is not annotated with @Component or
//    when custom instantiation logic is required. It allows
//    Spring to manage the object’s lifecycle and dependency injection.
    @Bean(name = "student1")
    public Student getStudent(){
        Student student =new Student(getTabelet());
        return student;
    }
}

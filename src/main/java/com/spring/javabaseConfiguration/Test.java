package com.spring.javabaseConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(StudentConfiguration_Bean.class);
        Student student1=context.getBean("student1", Student.class);
       student1.studentDetails();
       student1.getTablet().tabDetails();
    }
}

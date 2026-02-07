package com.spring.javabaseConfiguration;

import org.springframework.stereotype.Component;
// We use @Component on the Student class to tell Spring to detect it during
// component scanning and create it as a bean in the IoC container, so it can be
// managed and injected where required.
@Component
public class Student {

    private Tablet tablet;

    public Student(Tablet tablet) {
        this.tablet = tablet;
    }

    public Tablet getTablet() {
        return tablet;
    }


    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    public void studentDetails(){
        System.out.println("I am student class.....");
    }
}

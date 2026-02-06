package com.spring.auto.wire.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// Implementing Autowired Injection using annotation
//You can do autowired injection through annotation through 3 ways
//1. through at the top you can mention it @autowired
//2. through setter injection here you will mention the @autowired injection at the top of the setter  method
//3. through constructor injection here you will mention the @autowired injection at the top of the constructor (parameterized)
// Note: Always keep remember that when you creating the bean for an object give the name of the bean same as you gave the reference variable name for the object.z
public class Customer {

    //    Here I am mentioning @Qualifier annotation
//    Why: Because when you have 2 bean in the config file then your application context will get confused that which bean he has to take
//    and add the dependency so it gave the exception like found 2 bean while expected only one bean
//    So to remove that issue we are implementing @Qualifier annotation here and mentioning the bean name so that spring IOC container will understand
//    Like here the class needs bean based on the bean name the IOC container will provide the object for bean1

    @Autowired
    @Qualifier("address2")
    private Address address;


//   @Autowired
    public Address getAddress() {
        return address;
    }

//    @Autowired
    public void setAddress(Address address) {
        System.out.println("Injecting Object through autowired Setter Injection");
        this.address = address;
    }
//@Autowired
    public Customer(Address address) {
    System.out.println("Injecting dependency through constructor Injection...");

        this.address = address;
    }
    public Customer(){
        super();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address +
                '}';
    }
}

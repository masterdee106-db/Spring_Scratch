package com.spring.autowire;


import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

    private Address address;

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        System.out.println("Injecting through setter method...");
        this.address = address;
    }

    public Customer(Address address) {
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

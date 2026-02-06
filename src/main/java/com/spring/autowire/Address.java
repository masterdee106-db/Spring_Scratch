package com.spring.autowire;

public class Addeess {
    private String street;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Addeess(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public Addeess(){
        super();
    }

    @Override
    public String toString() {
        return "Addeess{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

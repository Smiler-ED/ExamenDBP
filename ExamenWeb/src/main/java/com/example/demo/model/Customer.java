package com.example.demo.model;

public class Customer {
    private String firstname;
    private String lastname;
     
    public Customer(){}
     
    public Customer(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
     
    // Nombres
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
     
    // Apellidos
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
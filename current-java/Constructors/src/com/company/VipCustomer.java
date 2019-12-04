package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    // third constructor
    public VipCustomer(){
        this("User Name",50000.00,"some@yahoo.com");
        System.out.println("This is the default constructor");
    }

    // second constructor
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@mail.com");
    }

    // first constructor
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

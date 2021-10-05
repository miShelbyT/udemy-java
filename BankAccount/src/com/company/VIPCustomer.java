package com.company;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;


    //first constructor calls the second which calls the third
    public VIPCustomer() {
        this("Default", 50000.00, "Default");
    }


    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown email");
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
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

package com.company;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    // the constructor
    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    // getter

    public String getName() {
        return name;
    }

    // getter
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("" + calculateInterest(1000.0, 2.0));
        System.out.println("" + calculateInterest(1000.0, 3.0));
        System.out.println("" + calculateInterest(1000.0, 4.0));
        System.out.println("" + calculateInterest(1000.0, 5.0));


        for (int i=8;i>=2; i--) {
            System.out.println("10,000 at "+ i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }
    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }
}

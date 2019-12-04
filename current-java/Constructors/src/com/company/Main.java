package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name,
        // email and phone number
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from
        // the balance field, but not allow the withdrawal to complete if there
        // are insufficient funds. You will went to create various code in the Main
        // class (the one created by IntelliJ) to confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        BankAccount nicksAccount = new BankAccount();//("12345",0.00,"Nick Vaklinov","myemail@nick.com","(087) 123-4567");

        System.out.println(nicksAccount.getNumber());
        System.out.println(nicksAccount.getBalance());

        nicksAccount.withdrawal(100.0);


        nicksAccount.deposit(50.0);
        nicksAccount.withdrawal(100.0);

        nicksAccount.deposit(51.0);
        nicksAccount.withdrawal(100.0);

    }

}












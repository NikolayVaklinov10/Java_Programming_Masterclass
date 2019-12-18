package com.company;

public class Main {

    public static void main(String[] args) {
        Account nickAccount = new Account("Tim");
        nickAccount.deposit(1000);
        nickAccount.withdraw(500);
        nickAccount.withdraw(-200);
        nickAccount.deposit(-20);
        nickAccount.calculateBalance();
//        nickAccount.balance = 5000;

        System.out.println("Balance on account is " + nickAccount.getBalance());
//        nickAccount.transactions.add(4500);
        nickAccount.calculateBalance();
    }
}

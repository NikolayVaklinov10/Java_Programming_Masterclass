package com.nickvaklinov;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        BankAccount account = new BankAccount("Nick", "Vaklinov", 1000.00);
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00,balance,0);

    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
    BankAccount account = new BankAccount("Nick", "Vaklinov",1000.00);
    account.deposit(200.00,true);
    assertEquals(800.00,account.getBalance(),0);
    }
}
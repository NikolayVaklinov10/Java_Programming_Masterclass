package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone nicksPhone;
        nicksPhone = new DeskPhone(1233456);
        nicksPhone.powerOn();
        nicksPhone.callPhone(1233456);
        nicksPhone.answer();


        nicksPhone = new MobilePhone(24565);
        nicksPhone.powerOn();
        nicksPhone.callPhone(24565);
        nicksPhone.answer();
    }
}

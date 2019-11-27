package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte myByte = 127;
        short myShort = 32767;
        int myInt = 1233456788;
        long total = myByte + myShort + myInt;
        long myLong = 50000L + (10L * total);
        System.out.println("The total amount of this challenge is: " + myLong);

        short shortTotal = (short) (1000 + 10 *
                (myByte + myShort + myInt));
        System.out.println("Casting with short resulting in :" + shortTotal);
    }
}

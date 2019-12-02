package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if ((i == 1) || (i == number) || (j == 1) || (j == number) || (i == j) || (j + i - 1 == number)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

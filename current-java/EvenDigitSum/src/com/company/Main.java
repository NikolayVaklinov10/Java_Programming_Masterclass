package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int digit, sum = 0;
        while (number > 0){
            digit = number % 10;
            sum += digit % 2 == 0 ? digit: 0;
            number /= 10;
        }
        return sum;
    }
}

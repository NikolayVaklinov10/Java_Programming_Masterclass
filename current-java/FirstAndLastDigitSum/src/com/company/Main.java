package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int l1 = 0;
        int sum = 0;
        int lastdigit = number % 10;

        while (number > 0){
            int firstdigit = number % 10;
            l1 = firstdigit;
            number = number / 10;
        }
        sum = l1 + lastdigit;
        return sum;
    }
}

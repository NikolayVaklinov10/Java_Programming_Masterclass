package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getGreatestCommonDivisor(int first,int second){
        if (first < 10 || second < 10) { //checking if any of values is less than "0"
            return -1;
        }
        int divisor; // Declaring variable "divisor"

        // Determine which of the numbers is less and assume it as the initial divisor
        if (first < second) {
            divisor = first;
        } else {
            divisor = second;
        }

        // Decrementing divisor value until remainders of both values are 0
        while ((first % divisor != 0) || (second % divisor != 0)) {
            divisor--;
        }

        // Return last divisor value
        return divisor;
    }
}

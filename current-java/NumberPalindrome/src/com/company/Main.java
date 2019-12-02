package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    public static boolean isPalindrome(int number ){
        //if (number <10){ return  false;   }
        int originalValue = number;
        int reverse=0;
        int digit;
        while (number !=0){
            digit =number %10;
            number /=10;
            reverse =( digit + reverse* 10 );
        }
        if (originalValue == reverse){
            return true;
        } else {return false;}
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasSameLastDigit ( int nb1, int nb2,    int nb3) {

        if (!isValid(nb1) || !isValid(nb2) || !isValid(nb3)) {
            return false;
        }

        int lastDigit1 = nb1 % 10;
        int lastDigit2 = nb2 % 10;
        int lastDigit3 = nb3 % 10;

        return (lastDigit1 == lastDigit2) || (lastDigit1 ==  lastDigit3) || (lastDigit2 == lastDigit3);
    }
    public static boolean isValid (int number) {

        return ((number >= 10) && (number <= 1000));
    }
}

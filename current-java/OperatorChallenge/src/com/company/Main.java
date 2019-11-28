package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create a double variable with a value of 20.00
        double myDoubleVariable = 20.00d;
        // Create a second variable of type double with the value 80.00.
        double mySecondDoubleVariable = 80.00d;
        // Add numbers together and multiply by 100.00
        double theTwoNumbers = (myDoubleVariable + mySecondDoubleVariable) * 100.00d;
        // Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00.
        // We used the modules or remainder operator on int's in the course, but we can also use it on a double.
        System.out.println("The two numbers together are total"+ theTwoNumbers);
        double remainingResult = theTwoNumbers % 40.00d;
        // Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero
        System.out.println("The remaining result is equal to :" + remainingResult);
        boolean isRemainderZero = (remainingResult == 0) ? true : false;
        // Output the boolean variable.
        System.out.println("Is remainder zero = " + isRemainderZero);
        // Write an if-then statement be surprised if you see output
        if (!isRemainderZero){
            System.out.println("Got some remainder value");
        }
    }
}

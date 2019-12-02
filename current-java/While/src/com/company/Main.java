package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        int count = 6;
//        while (count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        for(int i=6; i!=6; i++){
//            System.out.println("Count value is " + count);
//        }
//
//        count = 6;
//        do{
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100){
//                break;
//            }
//        }while (count != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//
//
//            }
//            System.out.println("Even number " + number);
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;


            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    // Create a method called isEvenNumber that takes a parameter of type
    // int It's purpose is to determine if the argument passed to the
    // method is an even or not.
    // return true if an even number, otherwise return false;





    public static boolean isEvenNumber(int number){
        if(number %  2 == 0){
            return true;
        }
        return false;
    }


}

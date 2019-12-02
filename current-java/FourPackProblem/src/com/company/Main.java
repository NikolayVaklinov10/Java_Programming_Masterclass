package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount <0 || smallCount <0 || goal <0){return false;}
        int sumOfBig = bigCount * 5; int goalDivBig = goal / 5;

        if(goalDivBig >= bigCount){
            goal -= sumOfBig;
        }else{
            goal -= goalDivBig * 5;
        }
        if(smallCount >= goal){return true;}else{return false;}
    }//
}

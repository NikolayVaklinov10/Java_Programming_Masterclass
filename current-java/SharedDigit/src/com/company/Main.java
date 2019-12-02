package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


        public static boolean hasSharedDigit(int x, int y) {
            if(x<10 || x>99 || y<10 || y>99)
                return false;
            else {
                int rem1,rem2,temp=y;
                while(x>0) {
                    rem1=x%10;
                    while(y>0) {
                        rem2=y%10;
                        if(rem1==rem2)
                            return true;
                        y/=10;
                    }
                    y=temp;
                    x/=10;
                }
                return false;
            }
        }
}

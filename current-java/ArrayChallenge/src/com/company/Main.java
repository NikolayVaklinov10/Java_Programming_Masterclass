package com.company;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] arr = {13, 7, 6, 45, 21,9, 2, 100};

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("This is my reversed order array " + Arrays.toString(arr));
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                break;
            }
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }
        long average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}

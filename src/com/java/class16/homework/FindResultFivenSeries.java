package com.java.class16.homework;
//Find result of given series 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10

import java.util.Scanner;

public class FindResultFivenSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}









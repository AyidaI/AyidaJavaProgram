package com.java.class16.homework;
//Find divisor of given number (Input - 6, output will be 1 2 3 6)

import javax.swing.plaf.IconUIResource;

public class FindDivisorOfGivenNum {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}

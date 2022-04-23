package com.java.class17.homework;

import java.util.Scanner;

//print all prime numbers from 1 to 50
public class PrintPrimeNumFrom1To50 {

    public static void main(String[] args) {

        int i = 0, num = 0;
        String primeNumber = "";

        for (i = 1; i <= 50; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                primeNumber = primeNumber + i + " ";
            }}
            System.out.println("Prime number from 1 to 50 are: ");
            System.out.println(primeNumber);
        }
    }




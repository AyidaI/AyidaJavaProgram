package com.java.class05;

import java.util.Scanner;
//Take two numbers from user and print greater number out of two numbers
//or print equals ig they're equal numbers

public class ScannerExample3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "is greater");
        } else {
            if (num1 == num2) {
                System.out.println("equal");
            } else {
                System.out.println(num2 + "is greater");

            }
        }
    }
}
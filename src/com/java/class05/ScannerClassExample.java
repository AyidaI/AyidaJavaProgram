package com.java.class05;

import java.util.Scanner;

public class ScannerClassExample {
    //Scanner class - to get user input in program (from keyboart)
    //Two num from user and print greater out of two num
    public static void main(String[] args) {
        System.out.println("Enter any two numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if (num1 >num2) {
            System.out.println(num1);  //or (num1 + "is greater")

        } else {
            System.out.println(num2); //or num2 + "is greater")
        }
    }
}

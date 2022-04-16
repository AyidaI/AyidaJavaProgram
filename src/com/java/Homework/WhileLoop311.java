package com.java.Homework;

//Write a program to print numbers that are not divisible
// by 3 and divisible by 7

import java.util.Scanner;

public class WhileLoop311 {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);

        int y = 1;

        while (y <= 50) {
            if (y % 3 != 0 && y % 7 == 0) {

                System.out.println(y);
            }
            y++;
        }
    }
}









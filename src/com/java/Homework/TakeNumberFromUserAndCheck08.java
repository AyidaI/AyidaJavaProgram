package com.java.Homework;
import java.util.Scanner;
//Write a program to take number from user and check if it is divisible by 5 or 3
public class TakeNumberFromUserAndCheck08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();


        if (x % 5 == 0 || x % 3 == 0) {
            System.out.println(x+ "Divisible by 5 or 3");
        } else{
            System.out.println("Number not divisible by 5 or 3");
        }
    }
    }



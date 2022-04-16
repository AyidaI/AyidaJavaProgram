package com.java.Homework;
//Write a program to print table of given number. If user enters 3 then print table of 3 like below
//3 6 9 12 15 18 21 24 27 30
import java.util.Scanner;

public class WhileLoop11 {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y=1;
        while (y<=10){
            System.out.println(y*3);
            y++;
        }
    }
}

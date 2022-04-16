package com.java.examplesfromothersexercises;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your Age.");
        int age = sc.nextInt();

        if(age<18){
            System.out.println("You are Minor.");
            System.out.println("You are Not Eligible to Work ");
        }else if(age>=18 && age<=60){
            System.out.println("You are Eligible to Work.");
        }else{
            System.out.println("You are too old to work.");
            System.out.println("Please collect your Pension.");
        }
    }
}

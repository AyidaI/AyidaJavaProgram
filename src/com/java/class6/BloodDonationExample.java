package com.java.class6;
import java.util.Scanner;

public class BloodDonationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your weight");
        int weight = sc.nextInt();
        //Output
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You're eligible");
            } else {
                System.out.println("you're under weight");
            }
        } else {
            if (weight >= 50) {
                System.out.println("You're too young");
            } else {
                System.out.println("You're tottally not eligible");
            }
        }
    }
}
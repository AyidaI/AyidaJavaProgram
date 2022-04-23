package com.java.class16;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //take number from user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), count = 0;

        for (int i = 1; i <= num; i++) {   // print to given num
            if (num % i == 0) {
                count++;}}
        if(count==2){
            System.out.println("Prime num");
        } else{
            System.out.println("Not prime num");
        }
    }}





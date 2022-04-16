package com.java.Homework;

import java.util.Scanner;

public class ForLoopFractorial12Ex2 {
    public static void main(String[] args) {
        System.out.println("Please enter number to get fractorial:");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int frac=1;

        for(int i=1; i<=num; i++){
            frac=frac*i;
            if(frac<0){
                System.out.println("Oh, my CPU is exploding! Sorry, I can't calculate such huge number!..:)");
                break;
            }
        }
        if(frac>0){
            System.out.println(num+" is "+frac);
        }
    }
}

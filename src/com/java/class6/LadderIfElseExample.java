package com.java.class6;
//write a program when user enter any number from 0 to 6
//print days of week
//0-sunday, 1-monday, 2-tuesday

import java.util.Scanner;
public class LadderIfElseExample {
    public static void main(String[] args) {
      //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 0 to 6");
        int dayNum = sc.nextInt();

        if(dayNum==0) {
            System.out.println("Sun");
        }else if(dayNum==1){
            System.out.println("Mon");
        }else if(dayNum==2){
            System.out.println("Tues");
        }else if(dayNum==3){
            System.out.println("Wed");
        }else if(dayNum==4){
            System.out.println("Thur");
        }else if(dayNum==5){
            System.out.println("Frid");
        }else if(dayNum==6) {
            System.out.println("Sat");
        }else {
            System.out.println("Please enter from 0 to 6");
        }
    }
}


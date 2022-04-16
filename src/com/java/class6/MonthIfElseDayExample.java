package com.java.class6;

import java.util.Scanner;

public class MonthIfElseDayExample {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number of month from 1 to 12 and print day");
            int monthNum = sc.nextInt();


            if(monthNum==1) {
                System.out.println("31 days in January");
            }else if(monthNum==2){
                System.out.println("28 days in Feb");
            }else if(monthNum==3){
                System.out.println("31 days in March");
            }else if(monthNum==4){
                System.out.println("30 days in Apr");
            }else if(monthNum==5){
                System.out.println("31 days in May");
            }else if(monthNum==6){
                System.out.println("30 days in June");
            }else if(monthNum==7) {
                System.out.println("31 days in July");
            }else if(monthNum==8) {
                System.out.println("31 days in August");
            }else if(monthNum==9) {
                System.out.println("30 days in Sept");
            }else if(monthNum==10) {
                System.out.println("31 days inOctob");
            }else if(monthNum==11) {
                System.out.println("30 days in Nov");
            }else if(monthNum==12) {
                System.out.println("31 days in Dec");
            }else {
                System.out.println("Please enter month");
                System.out.println(monthNum + " is not a month");

            }
        }
    }



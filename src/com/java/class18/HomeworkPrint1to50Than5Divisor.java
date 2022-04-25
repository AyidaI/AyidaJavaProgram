package com.java.class18;
//Write a program to print all numbers from 1 to 50 which has more than 5 divisor
public class HomeworkPrint1to50Than5Divisor {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++){
            if(isDivisor(i)){
                System.out.println(i);
            }
        }}
        static boolean isDivisor(int num) {


                if (num % 5 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }


package com.java.Homework;
//Write a program to print numbers that are divisible by 3 and 5 from 1 to 50

public class WhileLoop211 {
    public static void main(String[] args) {
        int a=1;
        while (a<=50){
            if(a%3==0 && a%5==0){
                System.out.println(a);

            }
            a++;
        }
    }

}

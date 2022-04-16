package com.java.Homework;
import java.util.Scanner;
//Write a program to get T-shirt size in inches and print size based on inches
//if inches is 27 to 30 Print XS
//if inches is 31 to 34 Print S
//if inches is 35 to 38 Print M
//if inches is 39 to 42 Print L
//if inches is 45 to 50 Print XL


public class TshirtSizeInInchesAndPrintSize08 {
    public static void main(String[] args) {

        System.out.println("Enter inches");
        Scanner sc = new Scanner(System.in);
        int inches= sc.nextInt();

        if(inches==27 || inches<=30){
            System.out.println("It is size XS:");
        }else if(inches==31 || inches<=34){
            System.out.println("It is size S:");
        }else if(inches==35 || inches<=38){
            System.out.println("It is size M:");
        }else if(inches==39 || inches<=42){
            System.out.println("It is size L:");
        }else if(inches==45 || inches<=50) {
            System.out.println("It is size XL:");
        }else {
            System.out.println("Your size XXL");
        }
    }
}

package com.java.class17.homework;

import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }}
static boolean isPrime(int num){
        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
}}




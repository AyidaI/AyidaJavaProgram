package com.java.class17;

import java.util.Scanner;

public class PrimeNumUsingBoolean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        boolean isPrime=true;

        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true) {
            System.out.println("Prime number");
        }else{
            System.out.println("It's not prime");
        }
    }
}

package com.java.class6;

import java.util.Scanner;

public class PositiveNegativeExample2{

        public static void main(String[] args) {

         Scanner sc =new Scanner(System.in);
            System.out.println("Enter any number");
            int num= sc.nextInt();

            if(num>0) {
                System.out.println("Positive");
            }else if(num<0){   //or else{
                System.out.println("Negative");
            }else if (num==0){
                System.out.println("Zero");
            }
        }
    }


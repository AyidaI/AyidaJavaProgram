package com.java.class10WhileLoop;

import java.util.Scanner;

public class SwapVariables2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int a=sc.nextInt(), b= sc.nextInt();
     int c;
           c=a;
           a=b;
           b=c;

        System.out.println(a);
        System.out.println(b);


        // 1. without using third variable
        a=a+b;
        b=a-b;
        a=a-b;


        //2. without using third variable
        a=a*b;
        b=a/b;
        a=a/b;
        }
    }


package com.java.class10WhileLoop;

import java.util.Scanner;

public class SwapVariables3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt(), b= sc.nextInt();
        int c;
        a=b;    //20 swap to 30
        b=a;    //30 swap to 30
        b=a-15;  //30-15=15
        System.out.println(a);
        System.out.println(b);


    }
}

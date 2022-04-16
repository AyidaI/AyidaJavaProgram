package com.java.class05;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 =sc.nextInt(), num2= sc.nextInt();

        if(num1>=num2) {
            if (num1 > num2) {
                System.out.println(num1 + "is greater");
            } else {
                System.out.println("Equal");
            }
        }else{
                System.out.println(num2+"is greater");
            }
        }
    }


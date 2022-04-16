package com.java.class15;
//print reverse of given string

import java.util.Scanner;

public class ReverseOfGivenString {
    public static void main(String[] args) {
        System.out.println("Please enter String:");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        for(int i=str.length()-1; i>=0; i--){
            System.out.println(str.charAt(i));
        }
    }

}

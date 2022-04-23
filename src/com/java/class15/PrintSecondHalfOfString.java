package com.java.class15;

import java.util.Scanner;

public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        System.out.println(str.substring(str.length()/2, str.length()));

        if(str.length()%2==0){
            System.out.println(str.substring(str.length()/2));  // even num of char in the word
        }else{
            System.out.println(str.substring(str.length()/2+1));  //odd num of char in the word
        }
    }
}

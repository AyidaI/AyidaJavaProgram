package com.java.class16;
//write a program to take one string from user and print
//occurance of given char in string

import java.util.Scanner;

public class FindOccurenceOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="This is my java program";
        char c='a';
       int count=0;

        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        System.out.println(count);
    }
}

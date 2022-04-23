package com.java.class16;
//write a program to take one statements from user and find out number of words
//we have inside the statement
//ex input -Hello, This is my first java String program
//output -8

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        String[] parts= str.split(" ");
        System.out.println(parts.length);


    }
}

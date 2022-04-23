package com.java.class18;

import java.util.Scanner;

public class CheckPalindrome3 {
    public static void main(String[] args) {


    //take string from user
    Scanner sc=new Scanner(System.in);
    String str= sc.nextLine();

    //find reverse of given string
    String rev=getReverse(str);

//compare Rev with original String to check if palindrome
    if(str.equals(rev)){
        System.out.println("It's palindrome");
    }else {
        System.out.println("Not palindrome");
    }
    }
//this method will find reverse of given String
    static String getReverse(String str){
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        return rev;
}}

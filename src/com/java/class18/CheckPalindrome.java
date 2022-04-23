package com.java.class18;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class CheckPalindrome {


        static boolean isPalindrome(String str){

        String rev="";

        for(int i=str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)) {
            return true;
        }else {
            return false;
        }}
            public static void main(String[] args) {
        System.out.println("Enter any String");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
            if(isPalindrome(str)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not Palindrome");
            }

        }
}

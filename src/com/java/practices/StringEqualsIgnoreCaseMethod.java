package com.java.practices;




//importing required clases
import java.util.Scanner;

    public class StringEqualsIgnoreCaseMethod { //main class
        public static void main(java.lang.String[] args) {  //main driver method
            //declaring and initializing strings to compare
            Scanner sc=new Scanner(System.in);
            java.lang.String str1="GeeKS FOr GEEks";
            java.lang.String str2="geeKs foR gEEKs";
            java.lang.String str3="ksgee orF geeks";
//comparing strings if we ignore the case
            boolean result1=str2.equalsIgnoreCase(str1);

            //both the strings are equal so displaying true
            System.out.println("str2 is equal to str1 = "+result1);

            //even if we ignore the case
            boolean result2 =str2.equalsIgnoreCase(str3);

            //both the strings are not equal so display false
            System.out.println("str2 is equal to str3= " +result2);

        }
    }

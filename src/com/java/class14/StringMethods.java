package com.java.class14;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String str1="Hello World";
        String str2="hello World";
        String str3="Hello World! Welcome to Devx!";

        //1. We want to check equality of two string
        System.out.println("1. Equality " + str1.equals(str2));
        System.out.println("================");

        //2. check equality of two string ignoring case
        System.out.println("2. Equality ignoring case " + str1.equalsIgnoreCase(str2));
        System.out.println("=================");

        //3. Check one String contains another string
        //contains will check one string contains another string considering case-sensitive
        System.out.println("3. Contains " + str1.contains(str3));
        System.out.println(str3.contains(str2));
        System.out.println("==================");


        //If we want check one string contains another string ignoring case then we have to change
        //both string in same case and then check contains, so it'll check only content of both string
        String str3LowerCase=str3.toLowerCase();
        String str2LowerCase=str2.toLowerCase();

        System.out.println("3.1. contains: " + str3LowerCase.contains(str2LowerCase));
        System.out.println("==================");

        //4.Changing the case of String
        System.out.println("4. Upper case: " + str3.toUpperCase());
        System.out.println("4. Lower case: " + str3.toLowerCase());
        System.out.println("===============");

        //5. Find index of character
        str1="Hello World";
        System.out.println("5. Index of Char: "+ str1.indexOf('W'));
        System.out.println("5. Last Index of char: "+str3.lastIndexOf('W'));
        System.out.println("============");

        //6. Find character at index
        System.out.println("6. Index of char: "+str1.charAt(0));
        System.out.println("=============");

         //7. Length of String
        str1="Hello World";
        str3="Hello World! Welcome to Devx!";
        System.out.println("7. Length of String:" +str1.length());
        System.out.println("7. Length of String:" +str3.length());
        System.out.println("==============");

        //8. Empty or Blank
        str1="          ";
        str3="   ";
        System.out.println("8. Empty:" +str1.isEmpty());
        System.out.println("8. Empty:" +str3.isEmpty());
        System.out.println("8. Blank:" +str1.isBlank());
        System.out.println("8. Blank:" +str3.isEmpty());

        //9. Replace & ReplaceAll
        str1="PRICE IS INR 200 INR 300 INR 500";
        str3="Devx";
        System.out.println("9. Replace: "+ str1.replace("INR", "USD"));
        System.out.println("9. Replace: "+str1.replaceAll("[a-zA-Z]",""));
        System.out.println("================");

        //10. Format
        str1="Welcome %s, Welcome to %s";
        System.out.println(String.format("10. Format: "+str1,"Chirag", "Ebay"));
        System.out.println("============");

//11. SubString
        str1="Welcome to java class. Today is fun day";

        System.out.println("11. Substring: "+ str1.substring(7));
        System.out.println("11. Substring: "+str1.substring(0,7));
        System.out.println("===========");



        //12. Split

        str1="Welcome to java class.";
        String[] words = str1.split(" ");
        System.out.println("12. Split: "+words[0]);
        System.out.println("12. Split: "+words[1]);
        System.out.println("12. Split: "+words[2]);
        System.out.println("12. Split: "+words[3]);
        System.out.println("=============");

//find lenght of string
        System.out.println("12. Split: "+words.length);
        for(int i=0; i< words.length; i++){
            System.out.println(words[i]);






        }





    }
}

package com.java.practices;


    //working of substring (int begIndex)
    public class StringSubstringBegIndex {
        public static void main(String[] args) {

            //Initializing string
            String str=new String("Welcome to geeksforgeeks");

            //using substring() to extract substring
            //returns (whiteSpace) geeksforgeeks
            System.out.println("The extracted substring is : ");
            System.out.println(str.substring(10));

            //working of substring (int begIndex, int endIndex)

            //initializing string
            String str1=new String("Welcome to geeksforgeeks");

            //using substring() to extract substring
            //returns geeks
            System.out.println("The extracted substring is : ");
            System.out.println(str1.substring(10, 16));

//application of substring
            String str2=new String("Rs 1000");

            //printing original string
            System.out.println("The original string is: ");
            System.out.println(str2);

            //using substring() to extract substring
            //returns 1000
            System.out.println("The extracted substring is : ");
            System.out.println(str2.substring(3));

        }
    }



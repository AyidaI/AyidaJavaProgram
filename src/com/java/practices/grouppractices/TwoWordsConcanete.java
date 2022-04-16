package com.java.practices.grouppractices;

import java.util.Scanner;
////* Take two words from from the user and concatenate two words together
////* however if the concatenation creates a  double char, then omit one of the characters. Save the result of concatenation and print it out.
////         * ex:
////         * "abc" "cat" -> "abcat"
////         *
////         * ex2:
////         * abc", "xyz" -> "abcxyz"
////         *
////         * ex3:
////         * "happy", "yolk" -> happyolk
public class TwoWordsConcanete {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any two words");
            String str= sc.nextLine();
            String str2= sc.nextLine();
            String combined="";

            if(str.charAt(str.length()-1)==(str2.charAt(0))){
                combined=str + str2.substring(1);
            }else{
                combined=str+str2;
            }
            System.out.println(combined);
        }
    }


package com.java.practices.grouppractices;

import java.util.Scanner;

public class CharacConcanete {

    ///**
//         * Take two words from the user, concatenate  words that have three characters one by one and print them
//         * if any of the words has more than three characters print Error message "Incorrect input! Cannot merge".
//         *
//         * ex
//         * "ice", "sea"
//         *
//         * output:
//         * isceae
//         *
//         * ex2:
//         * "Hot", "Day"
//         *
//         * output:
//         * HDoaty
//         *
//         * ex3:
//         * "Hello", "Day"
//         * output:
//         * Incorrect input! Cannot merge
//         */

        public static void main(String[] args) {
            System.out.println("Input two words");
            Scanner sc=new Scanner(System.in);
            String user1= sc.nextLine();
            String user2= sc.nextLine();
            String result="";

            //length of str=3
            if (user1.length()==3 && user2.length()==3){
                for(int i=0; i<3; i++) {
                    result = result + user1.charAt(i) + user2.charAt(i);
                }
                System.out.println(result);
            }if(user1.length()>3 || user2.length()>3){
                System.out.println("Incorrect input! Cannot merge.");
            }
        }
    }


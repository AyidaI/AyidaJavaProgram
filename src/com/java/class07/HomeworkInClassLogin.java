package com.java.class07;
import java.util.Scanner;
// Write a program to take username and password from user and print appropriate message
//based on below conditions
//	1. If username correct and password correct ---> Login successful
//	2. If username correct and password incorrect --> Invalid password
//	3. If username incorrect and password correct --> Invalid username
//	2. If username incorrect and password incorrect --> Login unsuccessful

public class HomeworkInClassLogin {
    //Input
    public static void main(String[] args) {
        System.out.println("Please enter username &password:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(), password = sc.nextLine();
        String expUsername = "Devx", expPassword = "Spring2022";


//Output
        //1
        if (username == expUsername && password == expPassword) {
            System.out.println("Login successful.");
        } else if (username != expUsername && password != expPassword) {
            System.out.println("Login unsuccessful.");
        } else if (username != expUsername && password == expPassword) {
            System.out.println("Invalid username.");
        } else {
            System.out.println("Invalid password.");


//2
            if (username == expUsername) {
                if (password == expPassword) {
                    System.out.println("Login successful.");
                } else {
                    System.out.println("Invalid password.");
                }
            } else {
                if (password == expPassword) {
                    System.out.println("Invalid username.");
                } else {
                    System.out.println("Login Unsuccessful.");


                }
            }
        }
    }
}






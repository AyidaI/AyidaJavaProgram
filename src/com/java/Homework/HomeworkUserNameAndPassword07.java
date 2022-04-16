package com.java.Homework;
import java.util.Scanner;
// Write a program to take username and password from user and print appropriate message
//based on below conditions
//	1. If username correct and password correct ---> Login successful
//	2. If username correct and password incorrect --> Invalid password
//	3. If username incorrect and password correct --> Invalid username
//	2. If username incorrect and password incorrect --> Login unsuccessful

public class HomeworkUserNameAndPassword07 {
    //Input
    public static void main(String[] args) {
        System.out.println("Please enter username &password:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(), password = sc.nextLine();


//Output
        //1

        if (username.equals("Devx") && password.equals("Spring2022")) {
            System.out.println("Login successful.");
        } else if (username.equals("Devx") && password.equals("Incorrect")) {
            System.out.println("Invalid password.");
        } else if (username.equals("Incorrect") && password.equals("Spring2022")) {
            System.out.println("Invalid username.");
        } else {
            System.out.println("Login unsuccessful.");
        }
    }
}


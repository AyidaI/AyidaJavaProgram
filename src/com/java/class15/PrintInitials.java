package com.java.class15;

import java.util.Scanner;

//Take Full name from user and print initials of it
public class PrintInitials {
    public static void main(String[] args) {
        System.out.println("Please enter your Fullname:");
        Scanner sc=new Scanner(System.in);
        String fullName= sc.nextLine();
        String parts[]= fullName.split(" ");

        String firstName=parts[0];
        String middleName=parts[1];
        String lasttName=parts[2];
        System.out.println(firstName.charAt(0)+"." +middleName.charAt(0)+"."+lasttName.charAt(0)+".");
    }
}

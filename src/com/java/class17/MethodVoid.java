package com.java.class17;
import java.util.Scanner;
public class MethodVoid {
    static void printLine(int length, char c) {
        for (int i = 1; i <= length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printLine(30, '=');
        System.out.println("Please enter first number: ");
        printLine(30, '=');
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printLine(30, '*');
        System.out.println("Please enter second number: ");
        printLine(30, '*');
        int b = sc.nextInt();
        printLine(30, '~');
    }
}

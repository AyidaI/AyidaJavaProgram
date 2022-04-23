package com.java.class17;

import java.util.Scanner;
//Calculator with Method

public class MethodExamCalcul {


    static void printEqual(int length,char c){
        for(int i=1; i<=length; i++){
        System.out.print(c);
    }
        System.out.println();
    }
    public static void main(String[] args) {
        printEqual(23,'=');

        System.out.println("Please enter first number: ");
        printEqual(23,'=');
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        printEqual(34,'=');
        System.out.println("Please enter second number: ");
        printEqual(23,'=');
        int b = sc.nextInt();
      printEqual(35,'*');
        System.out.println("Please enter the operation (Add/ Div/ Sub/ Mul)");
        String operation = sc.next();

        switch (operation){
            case "Add":
                System.out.println(a+b);
                break;
            case "Sub":
                System.out.println(a-b);
                break;
            case "Div":
                System.out.println(a/b);
                break;
            case "Mul":
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid choice...please try after hangout");
    }
}
}

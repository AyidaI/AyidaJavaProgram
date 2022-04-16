package com.java.class07;
import java.util.Scanner;
//Take one number from user and print number in text format
//Example input -1, output one

public class PrintNumberInText{
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num==0){
            System.out.println("Zero");
        }else if(num==1){
            System.out.println("One");
        }else if(num==2){
            System.out.println("Two");
        }else if(num==3){
            System.out.println("Three");
        }else if(num==4){
            System.out.println("Four");
        }else if(num==5){
            System.out.println("Five");
        }else if(num==6){
            System.out.println("Six");
        }else if(num==7){
            System.out.println("Seven");
        }else if(num==8){
            System.out.println("Eight");
        }else if(num==9){
            System.out.println("Nine");
       } else{
            System.out.println("Invalid input, please enter from 0-9 only");
        }
    }

}





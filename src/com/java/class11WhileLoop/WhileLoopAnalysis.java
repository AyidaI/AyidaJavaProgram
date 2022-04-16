package com.java.class11WhileLoop;

//10 20 30 40 50

import java.util.Scanner;

public class WhileLoopAnalysis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit= sc.nextInt();
        int i=1;

        while(i<=limit){
            System.out.println(i*10);//Stop here output your number than go to incerem.
            i++;
        }
    }
}

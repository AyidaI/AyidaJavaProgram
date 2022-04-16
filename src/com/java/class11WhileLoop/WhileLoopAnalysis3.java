package com.java.class11WhileLoop;

import java.util.Scanner;

//10 0 10 0 10 0 10 0 10 0
public class WhileLoopAnalysis3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit= sc.nextInt();
        int x=0, i=1;
        while (i<=limit){
            if(i%2==0){
                x=1/2;

                System.out.println(x);

            }else{
                System.out.println(10-x);
            }
            i++;
        }

    }

}

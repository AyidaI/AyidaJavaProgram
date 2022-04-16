package com.java.class04;

public class StringExample {
    //If we do addition with String it'll be concatenation
    //Str+Str=StrINt (concatenation)
    //Str+Int=StrInt (concatenation)
    //Int +Str=IntStr (concatenation)
    //Int+Int=Int (addition)

    public static void main(String[] args) {

    int a=10, b=20, c=30;
    String str1="Hello";
    String str2="Java";
System.out.println(str1 +str2);  //HelloJava
System.out.println(a);//10
        System.out.println(str1 +a); //Hello10
        System.out.println(a+b);  //30
        System.out.println("a+b");   //a+b (because it's String)
        System.out.println("a"+b+c);  //a2030 (because String first)
        System.out.println("a"+b);   //a20 (a is String and b is variable of type int)

        System.out.println(str1 +a+b);  //Hello1020 (left to right
        System.out.println(a+b+str1);   //30Hello
        System.out.println(str1 +a*b);   //Hello200 (multiply first than String.//As per priority we'll do multiplication firt and then String
       // System.out.println(str1 +a-b);  //Error
        System.out.println(a-b+str1);  //-10Hello
}
}




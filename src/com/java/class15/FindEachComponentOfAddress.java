package com.java.class15;
//write a program to print each component of sddress into separate line

public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address= "B3221, Moanalua Street, Honolulu, Hawaii 96818";
        String address1= "B3221, MoANALUa Street, HoNolulu, HawaII 96818";
        String address2= "B322,1 Moanalua Street, Honolulu, Hawaii 96818. My adress.";

        System.out.println("1. Equality: "+address.equals(address2));
        System.out.println("=============");

        System.out.println("2. Equality ignoring case: "+address.equalsIgnoreCase(address1));
        System.out.println("=============");

        System.out.println("3. Contains: "+address2.contains(address));
        System.out.println("=============");

        System.out.println("4. Upper Case: "+address2.toUpperCase());
        System.out.println("4. Lower Case: "+address2.toLowerCase());
        System.out.println("=========");

        System.out.println("5. Index of char: "+address.indexOf('M'));
        System.out.println("5. Last Index of char: "+address1.lastIndexOf('S'));
        System.out.println("=================");

        System.out.println("6. Index of char: "+address.charAt(12));
        System.out.println("==============");

        System.out.println("7. Lenght of String: "+address.length());
        System.out.println("===========");



//12. Split
        String[] words=address.split(",");
        System.out.println("12. Split: "+words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);







    }

    }


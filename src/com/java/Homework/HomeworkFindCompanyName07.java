package com.java.Homework;

    import java.util.Scanner;

    public class HomeworkFindCompanyName07 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("Enter name");
            switch (name) {
                case "gmail":
                case "youtube":
                    System.out.println("They are by Google.");
                case "outlook":
                case "Skype":
                case "Hangout":
                    System.out.println("They are by Microsoft.");
                case "whatsapp":
                    System.out.println("It is by Facebook.");
                    break;
                default:
                    System.out.println("They are not");

            }
        }
}

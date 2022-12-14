package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Enter your gender:");
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();
        System.out.println("Enter your phone number:");
        Long phone = scan.nextLong();
        System.out.println("Enter your zip code:");
        int zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your school name:");
        String school=scan.nextLine();
        System.out.println("Enter your city name:");
        String city=scan.nextLine();
        System.out.println(fullName+"\n"+phone+"\n"+zipCode+"\n"+school+"\n"+city);

scan.close();

    }
}

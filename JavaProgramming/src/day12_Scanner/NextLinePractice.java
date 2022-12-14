package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

    /*Ask the user to enter the age
    Ask the user to enter the full name
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scan.nextInt();
scan.nextLine();
        System.out.println("Enter your full name :");
        String fullName = scan.nextLine();

        System.out.println("Enter your GPA :");
        double GPA=scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter your School name :");
        String schoolName= scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("GPA = " + GPA);
        System.out.println("schoolName = " + schoolName);

        scan.close();


    }
}

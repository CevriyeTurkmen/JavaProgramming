package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();//valid age:1~120

        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Enter your age:");
            age = scan.nextInt();
        }
        System.out.println("Are you US citizen?");
        String answer = scan.next();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("No"))) {
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Are you US citizen?yes/no");
            answer = scan.next();
        }
        System.out.println(age>=18&&answer.equalsIgnoreCase("yes")?"you are eligible":"you are not eligible");

    }
}

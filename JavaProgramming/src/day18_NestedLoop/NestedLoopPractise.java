package day18_NestedLoop;

import java.util.Scanner;
import java.util.SortedMap;

public class NestedLoopPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your age: ");
            int age = scan.nextInt();

            while (!(age <= 120 && age >= 1)) {
                System.out.println("Invalid entry, please re enter");
                age = scan.nextInt();
            }
            System.out.println("Would you like the continue?");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid entry, please re enter");
                a = scan.next().toLowerCase();

            }if (a.equals("No")) {
                break;

            }


        }
scan.close();
    }
}

package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }

            System.out.println("Would you like to continue?");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry, please re enter");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }
        }





scan.close();







    }
}

package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first number:");
            int first = scan.nextInt();
            System.out.println("Enter your second number:");
            int second = scan.nextInt();

            System.out.println("Addition is: " + (first + second));

            System.out.println("Would you like to continue?");
            String answer=scan.next();
            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid entry, please re enter");
                answer=scan.next().toLowerCase();
            }
if (answer.equals("no")){
    break;
}


        }





























    }

}

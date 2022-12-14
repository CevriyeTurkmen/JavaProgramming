package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first= scan.nextInt();

        System.out.println("Enter the operator:");
        char operator=scan.next().charAt(0);

        if (!(operator=='+'||operator=='-')){
            System.err.println("Invalid math operator");

            System.exit(0);
        }

        System.out.println("Enter the second number:");
        int second= scan.nextInt();

        if (operator=='-'){
            System.out.println(first-second);
        }



scan.close();




















    }
}

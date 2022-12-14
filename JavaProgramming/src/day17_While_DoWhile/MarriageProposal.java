package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?yes/no");
        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Will you marry me?yes/no");
            answer = scan.next();
        }
        System.out.println((answer.equalsIgnoreCase("yes")?"Congrats":"Good bye"));















    }
}

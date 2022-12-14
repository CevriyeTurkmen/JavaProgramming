package day12_Scanner;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many total shares they have already?");
        int share = scan.nextInt();
        if (share >= 1) {
            System.out.println("How much your total value in the stock market is?");
            double totalValue = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter the name of the company you have the most shares in");
            String companyName = scan.nextLine();

            System.out.println("Your total stock market holding is $"+totalValue+" which is made up of "+ share+ " shares. "+ companyName+ " is your company holdings");

        } else System.out.println("invalid");
scan.close();

    }
}

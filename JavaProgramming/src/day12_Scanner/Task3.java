package day12_Scanner;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cents :");

      int cent= scan.nextInt();
        int dollar = 100;

        System.out.println(cent+ " cents equal to: "+cent/dollar+ " dollars and "+ cent%dollar+ " cents");


scan.close();
























    }
}

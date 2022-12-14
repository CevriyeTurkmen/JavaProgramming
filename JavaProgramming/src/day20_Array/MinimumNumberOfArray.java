package day20_Array;

import java.util.Scanner;

public class MinimumNumberOfArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();

        int[] number = new int[length];


        for (int i = number[0]; i < number.length; i++) {
            System.out.println("Enter a number");
            number[i] = scan.nextInt();
        }
            int min = number[0];
            for (int i = 0; i < number.length; i++) {

                if (number[i] < min) {
                    min = number[i];
                }

            }
        System.out.println("min = " + min);


        }

    }

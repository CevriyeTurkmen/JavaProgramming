package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();

        if (length<=0){
            System.out.println("Invalid");
            System.exit(0);
        }
        
        int[] number= new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number:");
           number[i]= scan.nextInt();
        }


        System.out.println(Arrays.toString(number));
        scan.close();

    }
}

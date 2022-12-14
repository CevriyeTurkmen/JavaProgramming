package Day13_Strings;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first string of text:");
        String str1 = scan.nextLine();

        System.out.println("Enter your second string of text:");
        String str2 = scan.nextLine();
scan.close();

        if (str1.length() > str2.length()) {
            System.out.println(str1);
        } else if (str1.length()<str2.length()) {
            System.out.println(str2);}else System.out.println("Both have same length");

        }


    }


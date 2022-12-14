package day14_Strings;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word1= scan.next();
        System.out.println("Enter a word");
        String word2= scan.next();

        System.out.println(word1.substring(1)+word2.substring(1));

scan.close();

















    }
}

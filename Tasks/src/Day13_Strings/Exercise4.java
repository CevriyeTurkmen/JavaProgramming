package Day13_Strings;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word:");
        String word=scan.next().toUpperCase();
        System.out.println("Enter second word:");
        String word2= scan.next().toUpperCase();

        char first= word.charAt(0);
        char second= word2.charAt(0);

        System.out.println(first+"."+second);


scan.close();










    }
}

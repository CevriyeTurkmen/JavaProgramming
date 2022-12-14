package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name:");
        String name= scan.next();
        System.out.println("Enter your last name:");
        String lastName= scan.next();
        char n= name.charAt(0);
        char f= lastName.charAt(0);
        String initial= n+"."+f;
        System.out.println(initial);
        scan.close();













    }
}

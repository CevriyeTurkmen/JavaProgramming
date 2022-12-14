package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your name :");
        String name= scan.nextLine();

        System.out.println("Enter your building number :");
        String building= scan.next();
        scan.nextLine();

        System.out.println("Enter your street name :");
        String StreetName= scan.nextLine();

        System.out.println("Enter your city name :");
        String city= scan.nextLine();

        System.out.println("Enter your State");
        String State= scan.next();

        System.out.println("Enter your Zip code");
        String ZipCode= scan.next();

        System.out.println(building+" "+ StreetName+" "+city+" "+State+" "+ZipCode);

scan.close();















        /*
        Ask the user to enter your full name
        Enter your building name
        Enter your street name
        Enter your city name
        Enter your State VA or CA
        Enter your ZIP code
        Displaye the shipping adress
         */
    }
}

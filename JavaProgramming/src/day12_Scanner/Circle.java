package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r= scan.nextDouble();
        double area= r * r * 3.14;
        double perimeter= 2*r *3.14;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        scan.close();























    }
}

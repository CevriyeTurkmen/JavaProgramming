package day12_Scanner;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the current speed");
        int currentSpeed=scan.nextInt();
        int speed= 55;
        if (currentSpeed>speed) System.out.println("You're driving "+ (currentSpeed-speed) +" mph over the limit. Slow down!");
scan.close();
    }
}

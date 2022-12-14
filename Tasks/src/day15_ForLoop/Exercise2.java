package day15_ForLoop;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
int num=0;
int countp=0;
int countn=0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number");
            num=scan.nextInt();

            if (num>0){
                countp++;
            }else countn++;
        }

        System.out.println(countp+ " positive and"+ countn+ " negative");

scan.close();
    }
}

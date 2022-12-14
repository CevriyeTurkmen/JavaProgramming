package week05_10_08_2022;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter first number:");
        double num1= scan.nextDouble();

        System.out.println("Please enter second number:");
        double num2= scan.nextDouble();

        System.out.println("Please enter your operator:");
        char operator= scan.next().charAt(0);
        double result=0;

        switch (operator){
            case '+':
                result= num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
            default:
                System.out.println("Operation is wrong");

        }


        System.out.println(result);




















    }
}

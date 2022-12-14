package day23_CustomMethods_Void;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {

        oddOrEven(16);
        ageOfPerson(1996);
        xToY(2, 20);

    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even number:" + number);
        } else System.out.println("Odd number:" + number);
    }

    public static void ageOfPerson(int year) {
        System.out.println("Age :" + (2022 - year));
    }


    public static void xToY(int x, int y) {
       int number=x;
       int number2=y;

        for (int i = x; i <= y; i++) {
            System.out.println(i);

        }
        }

    }




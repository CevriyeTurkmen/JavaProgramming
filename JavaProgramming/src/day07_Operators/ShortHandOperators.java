package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
//assigment:=
        int number = 100;
        number = 200;
        System.out.println("number = " + number);

        String word = "Java Programming";
        word = "Wooden Spoon";

        System.out.println("word = " + word);

        word = "string" + 1;

        System.out.println("word = " + word);
        System.out.println("____________________________________");

        //Addition Assignment:

        int x = 100;
        //x=x+200
        System.out.println("x = " + x);
        x += 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        num1 += 5.5;

        System.out.println("num1 = " + num1);

        num1-=1;
        System.out.println("num1 = " + num1);

        double salary= 50000.5;
        salary*=2;
        System.out.println("salary = " + salary);

        double dodge= 0.000000001;
        dodge*=1000000;
        System.out.println("dodge = " + dodge);

        double num2= 25000;
        num2/=2;
        System.out.println("num2 = " + num2);

        int balance=300;
        balance %=16;
        System.out.println("balance = " + balance);


















    }
}

package day25_CustomMethods_MethodOverloading;

public class SumOfThreeNumbers {
    public static void main(String[] args) {

int sum= sumOfThreeNumbers(15,25,67);

        System.out.println(sum);

       int sum2= sumOfFourNumbers(12,34,56,78);

        System.out.println(sum2);

    }

    public static int sumOfFourNumbers(int i, int i1, int i2, int i3) {

        return i+i1+i2+i3;
    }

    public static int sumOfThreeNumbers(int num, int num2, int num3) {

        return num+num2+num3;


    }


}

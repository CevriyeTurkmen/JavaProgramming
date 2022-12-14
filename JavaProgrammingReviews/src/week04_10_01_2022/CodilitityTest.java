package week04_10_01_2022;

public class CodilitityTest {
    public static void main(String[] args) {
        int N = 30;
        String result = "";

        if (N > 0) {
            if (N % 2 == 0) {
                result = "Codility";
            } else if (N % 3 == 0) {
                result = "Test";

            } else if (N % 5 == 0) {
                result = "Coders";
            } else System.out.println("Number is not divisible by 2 or 3 or 5");


        } else System.out.println("Your number is smaller than 0");

        System.out.println("result = " + result);
    }
}

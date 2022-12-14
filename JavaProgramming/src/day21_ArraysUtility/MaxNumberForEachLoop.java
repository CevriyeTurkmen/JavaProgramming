package day21_ArraysUtility;

public class MaxNumberForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];
        int min=numbers[0];

        for (int each : numbers) {
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);

        System.out.println("-----------------------------");

        for (int each2 : numbers) {
           if (each2<min){
               min=each2;

           }
        }
        System.out.println(min);
























    }
}
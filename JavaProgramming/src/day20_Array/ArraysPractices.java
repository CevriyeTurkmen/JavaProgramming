package day20_Array;

import java.util.Arrays;

public class ArraysPractices {
    public static void main(String[] args) {

        /*
        Store the elements;10,20,50,70
         */

        int[] elements = {10, 20, 50, 70};

        System.out.println(Arrays.toString(elements));

        System.out.println("-----------------------------------");

        //Create a variable that can contain 5 scores

        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;
        System.out.println(Arrays.toString(scores));
    }
}

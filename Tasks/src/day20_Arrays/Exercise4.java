package day20_Arrays;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5};

        int[] reversedArray = new int[number.length];

        for (int i = number.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = number[i];


        }
        System.out.println(Arrays.toString(reversedArray));


    }
}

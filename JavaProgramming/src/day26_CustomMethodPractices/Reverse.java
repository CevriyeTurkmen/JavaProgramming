package day26_CustomMethodPractices;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = reverse(array);

        System.out.println(Arrays.toString(result));


    }

    //reverses the given array, returns a new array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;

    }

    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;

    }

    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;

    }

    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;


    }



}
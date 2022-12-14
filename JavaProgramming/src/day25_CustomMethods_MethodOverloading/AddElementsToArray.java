package day25_CustomMethods_MethodOverloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5);

        System.out.println(Arrays.toString(arr));

        double[]arr2={1.5,2.5,3.5,4.5};

        arr2=adddoubleeger(arr2,5.5);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] addInteger(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }
    public static String[] addStringeger(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }

    public static double[] adddoubleeger(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }

    public static char[] addchareger(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }


}


package day26_CustomMethodPractices;

import java.util.Arrays;

public class MergeTwoArrays {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9};
        int[] array3 = merge(array, array2);

        System.out.println(Arrays.toString(array3));


    }

    //merge given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = new double[arr1.length + arr2.length];
        int i = 0;

        for (double each : arr1) {
            result[i++] = each;
        }
        for (double each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = new char[arr1.length + arr2.length];
        int i = 0;

        for (char each : arr1) {
            result[i++] = each;
        }
        for (char each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = new String[arr1.length + arr2.length];
        int i = 0;

        for (String each : arr1) {
            result[i++] = each;
        }
        for (String each : arr2) {
            result[i++] = each;
        }

        return result;

    }
    
    
    
    
    
    
    
    
    
    
    
    

}

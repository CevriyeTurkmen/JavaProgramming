package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] array = {100, 200, 3, 400, 5, 100, 100};

        array = replaceAll(array, 100, 20);

        System.out.println(Arrays.toString(array));


    }
//replaces all the matching old value with the new value
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }

        return array;


    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }

        return array;


    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }

        return array;


    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] .equalsIgnoreCase(oldElement) ) {
                array[i] = newElement;
            }

        }

        return array;


    }


















}

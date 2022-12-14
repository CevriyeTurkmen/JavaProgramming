package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);

        }
    }

    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);

        }
    }

    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);

        }
    }

    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);

        }
    }

    //returns the maximum number for integer array
    public static int maxNumber(int[] number) {
        Arrays.sort(number);
        return number[number.length - 1];

    }

    public static double maxNumber(double[] number) {
        Arrays.sort(number);
        return number[number.length - 1];

    }

    //returns the minimum number for integer array
    public static int minNumber(int[] number) {
        Arrays.sort(number);
        return number[0];
    }

    public static double minNumber(double[] number) {
        Arrays.sort(number);
        return number[0];
    }

    //checks if the given integer is contained in the given array(return boolean)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;

    }

    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;

    }

    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }

        }
        return result;

    }

    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;

    }

    //adds to given element to array, returns a new array
    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }

    public static String[] addElement(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }

    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }

    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element) {

        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    public static int frequencyOfElement(double[] array, double element) {

        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element) {

        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element) {

        int count = 0;
        for (String each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    //returns the unique elements of the array as the new array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }

    public static double[] uniqueElements(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }

    public static char[] uniqueElements(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }

    public static String[] uniqueElements(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }

    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {
        int[] result = new int[array.length - 1];
        int j = 0;

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid");
            System.exit(0);
        }
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }

        return result;

    }

    public static double[] removeElement(double[] array, double index) {
        double[] result = new double[array.length - 1];
        int j = 0;

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid");
            System.exit(0);
        }
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            result[j++] = array[(int) i];
        }

        return result;

    }

    public static char[] removeElement(char[] array, char index) {
        char[] result = new char[array.length - 1];
        int j = 0;

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid");
            System.exit(0);
        }
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            result[j++] = array[(int) i];
        }

        return result;

    }

    public static String[] removeElement(String[] array, int index) {
        String[] result = new String[array.length - 1];
        int j = 0;

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid");
            System.exit(0);
        }
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            result[j++] = array[(int) i];
        }

        return result;

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

    //replaces the given element of the array as the new element, returns array
    public static int[] replace(int[] array, int index, int newElement) {


        if (index < 0 || index > array.length) {
            System.err.println("invalid");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }

    public static double[] replace(double[] array, int index, double newElement) {


        if (index < 0 || index > array.length) {
            System.err.println("invalid");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }

    public static char[] replace(char[] array, int index, char newElement) {


        if (index < 0 || index > array.length) {
            System.err.println("invalid");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }

    public static String[] replace(String[] array, int index, String newElement) {


        if (index < 0 || index > array.length) {
            System.err.println("invalid");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }

    //replaces all the matching old values of the array with the new value
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

            if (array[i].equalsIgnoreCase(oldElement) ) {
                array[i] = newElement;
            }

        }

        return array;


    }

    //removes the duplicates from the given array; returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result={};

        for (int each : array) {

            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }

        return result;


    }

    public static double[] removeDuplicates(double[] array){

        double[] result={};

        for (double each : array) {

            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }

        return result;


    }

    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char each : array) {

            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String each : array) {

            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }

}

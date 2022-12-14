package day27_WrapperClasses;

import utilities.ArraysUtility;

public class RemoveDuplicates {

    public static void main(String[] args) {
        
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

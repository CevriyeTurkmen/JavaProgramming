package day26_CustomMethodPractices;

import utilities.ArraysUtility;

public class MergeTwoArrays2 {

    //merge given two arrays and returns the new array

    public static int[] merge(int[] array1, int[] array2) {

        int[] result = {};

        for (int each : array1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : array2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


}

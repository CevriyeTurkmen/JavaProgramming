package day26_CustomMethodPractices;

import utilities.ArraysUtility;

public class RemoveElements2 {
    public static int[] removeElement(int[] array, int index) {

        int[] result = {};

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid");
            System.exit(0);

            for (int i = 0; i < array.length; i++) {
                if (i != index) {

                    result = ArraysUtility.addElement(result, array[i]);
                }
            }

        }

        return result;
    }























}





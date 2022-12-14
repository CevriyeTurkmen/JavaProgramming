package day24_CustomMethods_Return;

public class TaskMaxNumber {
    public static void main(String[] args) {

        int[] arr = {2, 5, 76, 23, 8};


    }

    public static int maxNumber(int max) {

        int[] arr = new int[5];
        int maximum = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
return max;
    }



}


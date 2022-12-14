package day25_CustomMethods_MethodOverloading;

import java.util.Arrays;

public class Task1_Merge {

    public static void main(String[] args) {

      int[] arr1={1,2,3,4};
      int[]arr2={5,6,7,8};
    int[]merge=new int[arr1.length+arr2.length];


merge= merge(arr1,arr2);

        System.out.println(Arrays.toString(merge));



    }

    public static int[] merge(int[] arr1, int[] arr2){

        int[] result=new int [arr1.length+arr2.length];

        int i=0;

        for (int each : arr1) {
            result[i++]=each;

        }

        for (int each : arr2) {
            result[i++]=each;
        }

        return result;



    }
    public static char[] merge(char[] arr1, char[] arr2){


        char[] result=new char [arr1.length+ arr2.length];

        int i=0;

        for (char each : arr1) {
            result[i++]=each;

        }

        for (char each : arr2) {
            result[i++]=each;
        }

        return result;



    }

    public static double[] merge(double[] arr1, double[] arr2){

        double[] result=new double [arr1.length+ arr2.length];

        int i=0;

        for (double each : arr1) {
            result[i++]=each;

        }

        for (double each : arr2) {
            result[i++]=each;
        }

        return result;



    }




}

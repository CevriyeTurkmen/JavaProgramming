package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[] array={1,2,3,4,6};
      int[] arr2=replace(array,2,45);

        System.out.println(Arrays.toString(arr2));

    }

    public static int[] replace(int[] array, int index, int newElement) {


        if (index<0||index> array.length){
            System.err.println("invalid");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }

    public static double[] replace(double[] array, int index, double newElement) {


        if (index<0||index> array.length){
            System.err.println("invalid");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }

    public static char[] replace(char[] array, int index, char newElement) {


        if (index<0||index> array.length){
            System.err.println("invalid");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }

    public static String[] replace(String[] array, int index, String newElement) {


        if (index<0||index> array.length){
            System.err.println("invalid");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }



    
    
    
    
    
    
    
    
}

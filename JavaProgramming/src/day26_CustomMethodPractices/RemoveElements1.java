package day26_CustomMethodPractices;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

      int[] array={1,2,3,4,5};
        int[] result= removeElement(array, 2);

        System.out.println(Arrays.toString(result));



    }
//removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){
        int[] result=new int[array.length-1];
        int j=0;

        if (index<0||index> array.length-1){
            System.err.println("invalid");
            System.exit(0);
        }
        for (int i = 0; i < array.length; i++) {

            if (i==index){
                continue;
            }result[j++]=array[i];
        }

        return result;

        }

    public static double[] removeElement(double[] array, double index){
        double[] result=new double[array.length-1];
       int j=0;

        if (index<0||index> array.length-1){
            System.err.println("invalid");
            System.exit(0);
        }
        for (int i = 0; i < array.length; i++) {

            if (i==index){
                continue;
            }result[j++]=array[(int) i];
        }

        return result;

    }

    public static char[] removeElement(char[] array, char index){
        char[] result=new char[array.length-1];
        int j=0;

        if (index<0||index> array.length-1){
            System.err.println("invalid");
            System.exit(0);
        }
        for (int i = 0; i < array.length; i++) {

            if (i==index){
                continue;
            }result[j++]=array[(int) i];
        }

        return result;

    }

    public static String[] removeElement(String[] array, int index){
        String[] result=new String[array.length-1];
        int j=0;

        if (index<0||index> array.length-1){
            System.err.println("invalid");
            System.exit(0);
        }
        for (int i = 0; i < array.length; i++) {

            if (i==index){
                continue;
            }result[j++]=array[(int) i];
        }

        return result;

    }






    }



































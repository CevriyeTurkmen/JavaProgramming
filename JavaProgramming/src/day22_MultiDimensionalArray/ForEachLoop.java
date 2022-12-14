package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        for (int[] each : arr2D) {
            for (int i : each) {
                System.out.print(i+" ");
            }
            System.out.println();
        }





















    }
}

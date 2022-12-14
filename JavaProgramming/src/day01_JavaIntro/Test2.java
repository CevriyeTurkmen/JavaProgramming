package day01_JavaIntro;

import utilities.ArraysUtility;

import java.util.logging.SocketHandler;

public class Test2 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        ArraysUtility.printEachElement(nums);

        System.out.println("------------------------------------");

        String[] str = {"ayse", "Fatma", "Cevriye", "Kezban"};
        ArraysUtility.printEachElement(str);

        System.out.println("------------------------------------");

        int[] number = {34, 56, 78, 90};
        int max = ArraysUtility.maxNumber(number);
        System.out.println(max);

        System.out.println("------------------------------------");


        int[] arr = {34, 56, 78, 12};
        boolean isContain = ArraysUtility.contains(arr, 5);
        System.out.println(isContain);

        System.out.println("------------------------------------");

        String[] str7={"Ayse","Fatma","Cevriye"};

        boolean name=ArraysUtility.contains(str7,"Cevriye");
        System.out.println(name);








    }
}

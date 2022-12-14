package day21_ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur"};
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};
        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            students[i] = each;
            i++;
        }
        for (String each : group2) {
            students[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(students));

        char[] ch1={'a','b','c'};
        char[] ch2={'d','e','f','g','h'};
        char[] total=new char[ch1.length+ ch2.length];

        int i1=0;

        for (char each : ch1) {
            total[i1]=each;
i1++;
        }

        for (char each : ch2) {
            total[i1]=each;
            i1++;
        }


        System.out.println(Arrays.toString(total));



















    }
}

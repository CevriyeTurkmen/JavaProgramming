package day21_ArraysUtility;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="acdbed";
        String str2="dbca";
        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
Arrays.sort(ch1);
Arrays.sort(ch2);

boolean Anagram= Arrays.equals(ch1,ch2);

        System.out.println(Anagram);



























    }
}

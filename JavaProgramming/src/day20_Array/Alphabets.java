package day20_Array;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch--;
        }

        System.out.println(Arrays.toString(alphabets));


    }
}

package day15_ForLoop;

import javax.swing.*;

public class Exercise1 {

    public static void main(String[] args) {

        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0) {
                sum += i;
            }

        }System.out.println(sum);

        String str="A1B2C3";
        int sum1=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch>='0'&&ch<='9'){
                sum1+=ch-48;
            }
        }
        System.out.println(sum1);

    }
}

package week08_10_29_2022;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] x = {1, 2, 3};

        /*
        int temp=x[0];
        //first place = 2
        x[0]=x[1];
        //second place=3
        x[1]=x[2];
        last=1
        x[2]=temp;
         */
        int temp = x[0];
        //2 < 3
        for (int i = 0; i < x.length-1; i++) {
            x[i] = x[i + 1];
        }

        x[x.length-1]=temp;
        System.out.println(Arrays.toString(x));






    }
}

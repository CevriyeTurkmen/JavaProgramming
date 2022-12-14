package homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String result = "";
        if (num >= 0) result = "positive";
        else if (num == 0) {
            result = "zero";
        } else result = "negative";

        System.out.println(result);
s.close();

    }

}



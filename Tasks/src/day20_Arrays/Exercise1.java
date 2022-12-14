package day20_Arrays;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

String[] classmates={"Yasemin Coskun","Sirin Kasim","Gulsah Tosun","Suheda Erbag","Seyma Alaca","Arzu Kizilari"};

        for (String each : classmates) {
String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);

        }


















    }
}

package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Candy_Test {
    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(
                new Candy("Skittles", 12, 7, true),
                new Candy("M&M", 5, 4, false),
                new Candy("Kinder", 3, 5, true),
                new Candy("Lollipop",8,2,false),
                new Candy("Mentos",6,4,false)));


        for (Candy candy : candies) {
            System.out.println(candy.getBrand()+": "+candy.getPrice());
        }


    }
}

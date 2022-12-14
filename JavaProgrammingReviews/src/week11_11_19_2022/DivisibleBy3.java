package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleBy3 {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 8, 9));

        ArrayList<Integer> result = divisibleBy3(numbers);
        System.out.println(result);

    }

    public static ArrayList<Integer> divisibleBy3(ArrayList<Integer> numbers) {
        //removeIf()
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 3 == 0)
                result.add(number);
        }
        return result;

    }
}


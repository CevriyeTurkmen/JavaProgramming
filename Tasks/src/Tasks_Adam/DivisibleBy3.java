package Tasks_Adam;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleBy3 {

    public static void main(String[] args) {
        System.out.println(numbers());
    }


    public static ArrayList<Integer> numbers() {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2, 3, 4, 5, 6, 8, 9));

        numbers.removeIf(p -> !(p % 3 == 0));

      return numbers;

    }


}



            



















        /*
        Task 1 :

Create a method that which is get array list as a parameter then return the numbers which are divisible by 3.

input:

  numbers : 2,3,4,5,6,8,9

output:

3,6,9
         */












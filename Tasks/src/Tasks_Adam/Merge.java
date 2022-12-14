package Tasks_Adam;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(4, 5, 6));
        ArrayList<Integer> result = new ArrayList<>();


        for (Integer each : list1) {
            result.addAll(Arrays.asList(each));
        }
        for (Integer each : list2) {
            result.addAll(Arrays.asList(each));

        }

        System.out.println(result);
    }
}











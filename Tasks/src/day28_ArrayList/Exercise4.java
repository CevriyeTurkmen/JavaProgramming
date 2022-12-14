package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {





        String[] arr={"A","B","C"};
        String[] arr2={"D","E","F","G"};

        ArrayList<String>total=new ArrayList<>();
        for (String each : arr) {
            total.add(each);
        }
        for (String each : arr2) {
            total.add(each);
        }

        System.out.println(total);















    }
}

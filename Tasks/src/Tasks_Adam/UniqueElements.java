package Tasks_Adam;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>total=new ArrayList<>();

        list1.addAll(Arrays.asList(1,2,3,4,5));
        list2.addAll(Arrays.asList(4,5,6));

        for (Integer each : list1) {
            total.add(each);
        }
          list2.removeIf(p-> list1.contains(p) );

        for (Integer each : list2) {
            total.add(each);
        }
        System.out.println(total);

        }

        }











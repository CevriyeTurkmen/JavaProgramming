package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        for (Integer each : list) {
            if (result.contains(each)){
                continue;

            }
            result.add(each);
        }
        System.out.println(result);





























    }
}

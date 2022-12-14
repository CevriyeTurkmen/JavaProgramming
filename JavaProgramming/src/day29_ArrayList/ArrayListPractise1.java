package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise1 {
    public static void main(String[] args) {

       String[]countries={"Japan","Korea","United States","Turkey","united Kingtom","Canada"};

       ArrayList<String>list=new ArrayList<>(Arrays.asList(countries));
       list.removeIf(each-> each.length()>10);
   countries=list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));


















    }
}

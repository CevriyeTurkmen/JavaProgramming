package day30_CustomClass;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(list, 0,list.size()-1);
        System.out.println(list);


        ArrayList<Integer>number=new ArrayList<>();
        number.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size=list.size();
      list.removeAll(Arrays.asList(0));












    }
}

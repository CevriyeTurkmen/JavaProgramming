package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise2 {
    public static void main(String[] args) {

        String[] names={"Mary","Monica","Maehray","Musti","Sumeyra","Hasan","Beril"};

        ArrayList<String> list=new ArrayList<>(Arrays.asList(names));
        list.removeIf(p-> p.charAt(0)=='M');
        names=list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));

    }
}

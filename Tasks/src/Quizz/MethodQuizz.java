package Quizz;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodQuizz {
    public static void main(String[] args) {


        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for (Integer each : list) {
            if (each%2!=0){
                continue;
            }
            System.out.println(each+" ");
            break;
        }
        
        
        

    }
}
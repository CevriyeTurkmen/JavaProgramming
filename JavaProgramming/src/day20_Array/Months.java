package day20_Array;

public class Months {
    public static void main(String[] args) {
        String[] months={"January","February","March","April","May","Jun","July","August","September","October","November","December"};
        /*
        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);

         */

        for (int i = 0; i <months.length ; i++) {
            System.out.println(months[i]);
        }

            System.out.println("--------------------------------------");

        for (int i1 = months.length-1; i1 >=0 ; i1--) {
            System.out.println(months[i1]);
        }













    }
}

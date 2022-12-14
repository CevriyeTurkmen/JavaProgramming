package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        /*
        28 days= 2; 30 days= 4,6,9,11; 31 days=1,3,5,7,8,10,12
         */

        int months= 2;
        String result= "";
        int year= 2000;

        if (months>=1&&months<=12){


            switch (months){
                case 2 :
                    result= (year%4==0)?"29 days":"28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    result= "30 days";
                    break;
                default:
                    result= "31 days";
                    break;

            }

        }else result="invalid";

        System.out.println(result);






    }
}

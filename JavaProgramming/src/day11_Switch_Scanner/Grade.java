package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade= 'D';
        String result= "";

        switch (grade){
            case 'A':
                result="excellent";
                break;
            case 'B':
                result="Great";
                break;
            case 'C':
               result="Good";
                break;
            case 'D':
               result="Passed";
                break;
            case 'F':
               result="Failed";

            default:
                result="invalid";
        }
        System.out.println(result);










    }
}

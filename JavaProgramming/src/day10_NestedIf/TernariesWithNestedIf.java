package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int score = 80;
        /*if (score >= 0 && score <= 100) {//if score is valid

            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
        } else {
            System.out.println("invalid");//if score is invalid
        }

         */

        String result= (score>=0&&score<=100)?(score>60)?"passed":"failed":"invalid";
        System.out.println(result);












    }
}

package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 80;

        if (score >= 0 && score <= 100) {//if score is valid
            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
        } else {
            System.out.println("invalid");//if score is invalid
        }
        System.out.println("_________________________");

        int age= 25;
        boolean hasID=false;

        if (hasID) {
            if (age >= 21) {
                System.out.println("eligible to buy alcohol");
            } else {
                System.out.println("not eligible to buy alcohol");
            }
        }else System.out.println("You must have an ID to buy alcohol");

        System.out.println("____________________________________");

        int day=5;

        if (day>=1&&day<=7){//If the day is valid number there are 7 options
            if (day==1){
                System.out.println("monday");} else if (day==2) {
                System.out.println("tuesday");

            } else if (day==3) {
                System.out.println("Wednesday");

            } else if (day==4) {
                System.out.println("Thursday");

            } else if (day==5) {
                System.out.println("Friday");

            } else if (day==6) {
                System.out.println("Saturday");

            }else System.out.println("sunday");


        }else System.out.println("Invalid");





















    }
}

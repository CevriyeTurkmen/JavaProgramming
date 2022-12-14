package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        System.out.println(false != !true);
        int score = 85;
        if (score >= 90 && score <= 100) {
            System.out.println(score + "is excellent");
        }
        if (score >= 80 && score <= 89) {
            System.out.println(score + " is great ");
        }
        if (score >= 70 && score <= 79) {
            System.out.println(score + " is good");
        }
        if (score >= 60 && score <= 69) {
            System.out.println(score + " is passed");
        }
        if (score <= 59 && score >= 0) {
            System.out.println(score + " is failed");
        }

/*
90~100 ==>Excellent
80~89 ==>Great
70~79 ==> Good
60~69 ==> Passed
0~59 ==> Failed

 */

    }
}











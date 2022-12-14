package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
     int grade=60;
     String finalGrade;

     if (grade>=85&& grade<=100){ finalGrade
             ="A";}
     else if (grade>=70 && grade<=84) {finalGrade="B";}
     else if (grade>=60&&grade<=69) {finalGrade="C";}
     else if (grade>=50&&grade<=59) {finalGrade="D";}
     else if (grade>=40&&grade<=49) {finalGrade="E";}
     else {finalGrade="F";}
        System.out.println("finalGrade = " + finalGrade);


     }
}

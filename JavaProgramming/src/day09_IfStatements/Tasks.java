package day09_IfStatements;

public class Tasks {
    public static void main(String[] args) {

        int grade = 5;
        String location = "null";
        int numberOfGroups= 5;
        String teacherInCharge=" ";

        if (grade == 1) {
            location= " Apple orchard";
                    numberOfGroups= 3;
            teacherInCharge= " Ms.Smith";
            }else if (grade == 2) {
            location= " Zoo";
            numberOfGroups= 7;
            teacherInCharge= " Mr.Lee";
        } else if (grade == 3) {
            location= " Aquarium";
            numberOfGroups= 5;
            teacherInCharge= " Ms.Wilson";
        } else if (grade == 4) {
            location= "Movie Theater";
            numberOfGroups= 2;
            teacherInCharge= " Ms.Reyes";
        } else if (grade == 5) {
            location= " Museum";
            numberOfGroups= 5;
            teacherInCharge= " Ms.Lela";
        } else if (grade == 6) {
            location= " Six Flags";
            numberOfGroups= 8;
            teacherInCharge= " Mr.Watt";}

        System.out.println("Grade = "+grade+"\n"+"Location ="+ location+"\n"+"Number of Groups = "+numberOfGroups+ "\n"+ "Teacher in charge = "+teacherInCharge);

int number=1;

if (number==1){System.out.println(number+ "= one");} else if (number==2) {
    System.out.println(number+"= two");}

/*Create a class called Calculator, Given two double variables named n1
& n2, and a char variable named mathOperator, write a program that can
calculate result of n1&n2 based on the given math Operator.
char operator -> -, +, *, /
when operator is + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
for any other operators: print "invalid operator"
Ex:
n1 = 10, n2= 20, mathOperator = '+'
output:
30

 */

        double num1= 10;
        double num2=20;
        char mathOperator= '+';

        if (mathOperator=='+'){
            System.out.println("num1+num2= "+(num1+num2));} else if (mathOperator=='-'){
            System.out.println("num1-num2="+(num1-num2));} else if (mathOperator=='*') {
            System.out.println("num1*num2="+(num1*num2));} else if (mathOperator=='/') {
            System.out.println("num1/num2="+(num1/num2));   }
        }

    }


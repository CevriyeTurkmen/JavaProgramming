package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {

/* Write a program that can print the number of days in a month.
Ex;
number=1;
output=31 days;
Hints=
Months that has 31 days=1,3,5,7,8,10,12
Months that has 30 days=4,6,9,11
Months that has 28 day=2

 */
int number=5;
boolean has28Days= number==2;
boolean has30Days=number==4||number==6||number==9||number==11;
boolean has31Days=number==1||number==3||number==5||number==7||number==8||number==10||number==12;

if (has28Days){
    System.out.println("28 days");} else if (has30Days) {
    System.out.println("30 days");} else if (has31Days) {System.out.println("31 days");}

















    }
}

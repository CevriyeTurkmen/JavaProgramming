package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number=65;

        boolean isEvenlyDivisible2=number%2==0;
        boolean isEvenlyDivisible3=number%3==0;
        boolean isEvenlyDivisible5=number%5==0;

        System.out.println(number+ " is divisible by 2: "+ isEvenlyDivisible2);
        System.out.println(number+ " is divisible by 3: "+isEvenlyDivisible3);
        System.out.println(number+" is divisible by 5: "+isEvenlyDivisible5);

int year=1998;
boolean isLeapYear=year%4==0;
        System.out.println(year+" is leap year :"+ isLeapYear);

















    }
}

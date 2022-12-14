package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n=100;
        if (n%2==0){
            System.out.println("even");}
        else {System.out.println("odd");}

       String result= (n%2==0)?"even":"odd";
        System.out.println(result);

        int age=23;
        String eligible= (age>=21)?"is eligible to buy alcohol":"is not eligible to buy alcohol";
        System.out.println(eligible);

        int number=100;

        String result2= (number<=0)?"negative":(number==0)?"zero":"Positive";
        System.out.println(result2);

















    }
}

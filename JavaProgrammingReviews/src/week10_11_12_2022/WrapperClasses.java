package week10_11_12_2022;

public class WrapperClasses {
    public static void main(String[] args) {
/*
Task 1 : Find the word

                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                    Write a method that returns : Welcome To Core Java
 */

String str="(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";



String result="";

        for (char each : str.toCharArray()) {

            if (Character.isAlphabetic(each)||each==' '){
                result+=each;


            }

        }

        System.out.println(result);


    }
}

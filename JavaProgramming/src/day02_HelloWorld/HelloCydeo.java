package day02_HelloWorld;

public class HelloCydeo {

    public static void main(String[] args) {

String[] names={"Harold","Jack","Sushima","Cevriye"};


        for (String each : names) {
            System.out.println(each+ "gmail.com");

        }

        String[] names2 = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};

        int total=0;

        for (String each : names2) {
        total+=  Integer.valueOf(each.substring(each.length()-4));

        }
        System.out.println(total);







    }
}

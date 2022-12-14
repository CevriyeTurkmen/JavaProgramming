package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {
String str="Cydeo";
String str2=str.repeat(4);
        System.out.println(str2);

        String s1="Wooden Spoon ";
       String s2= s1.repeat(100);
        System.out.println(s2);
        System.out.println("Fady\n".repeat(5));


        String own="Herseye vakit buluyorum";
        String boy= "Mete okula alisti";
        String c=boy.substring(boy.indexOf("M"),boy.indexOf("e ")+1);
        String c2=boy.substring(boy.indexOf("o"));
        System.out.println(c);
        System.out.println(c2);
        String c3=own.substring(own.indexOf("H"));
        System.out.println(c3);

















    }
}

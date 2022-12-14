package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {
String str1= "       batch 25         ";
        str1=str1.trim();
        System.out.println("str1 = " + str1);

        String str2="Cydeo School";
        int n1= str2.indexOf("h");
        System.out.println("n1 = " + n1);
        int n2= str2.indexOf("o");
        System.out.println("n2 = " + n2);
        int n3=str2.indexOf("ool");
        System.out.println("n3 = " + n3);
String str3= "Java Programming language";
int n4= str3.indexOf("gu");
            System.out.println("n4 = " + n4);
            int n5=str3.lastIndexOf("g");
            System.out.println("n5 = " + n5);





























    }
}

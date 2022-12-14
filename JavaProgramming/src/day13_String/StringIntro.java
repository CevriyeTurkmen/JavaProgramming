package day13_String;

public class StringIntro {
    public static void main(String[] args) {

        String str="Wooden Spoon";
        String str2="Wooden Spoon";
        String str3="Wooden Spoon";
        String str4="Wooden Spoon";
        System.out.println(str==str2);
        System.out.println(str3==str4);

        System.out.println("____________________");

        String name= new String("Wooden Spoon");
        String name2= new String("Wooden Spoon");
        String name3= new String("Wooden Spoon");

        System.out.println(name2.equals(name3));












    }
}

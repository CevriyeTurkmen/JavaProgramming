package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word="Cydeo";
        char thirdChar= word.charAt(3);
        System.out.println(thirdChar);

        /*char tenthChar= word.charAt(9);
        System.out.println(tenthChar);*/

        String s1= "Batch 25 is the best batch";
        int totalChar=s1.length();
        System.out.println("totalChar = " + totalChar);
        char lastCharacter= s1.charAt(s1.length()-1);
        System.out.println("lastCharacter = " + lastCharacter);

        String str="Wooden Spoon";
        str= str.toUpperCase();
        System.out.println("str = " + str);

        String s="JAVA";
        s=s.toLowerCase();
        System.out.println("s = " + s);

















    }
}

package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
String str=" ";
boolean r=str.isEmpty();
        System.out.println(r);

        boolean r1= str.isBlank();
        System.out.println(r1);
        System.out.println("---------------------------");

        String s="CYDEO",
                s2="cydeo";

        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println("yes".equalsIgnoreCase("YES"));

        System.out.println("---------------------------");

       String sentence="My favorite programming language is Java";
        System.out.println(sentence.toLowerCase().contains("java"));
        System.out.println(sentence.contains("C#"));
        System.out.println("--------------------------------");

        String input1="I love JAva";
        String input2="Java";

        System.out.println(input1.contains(input2));
        System.out.println(input1.equals(input2));
        System.out.println(input1.toLowerCase().contains("java"));

        System.out.println("-------------------------");

        String a= "Wooden Spoon";
        System.out.println(a.startsWith("Woo"));
        System.out.println(a.toLowerCase().startsWith("woo"));
















    }
}

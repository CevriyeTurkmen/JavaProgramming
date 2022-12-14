package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        str = str.replace("Java", "Phyton");
        System.out.println("str = " + str);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);

        String sentence= "Java Java Phyton Phyton C# C# C++ C++ Phyton Phyton Phyton Phyton";

        sentence=sentence.replace("Phyton","").replace("  ","");
        System.out.println("sentence = " + sentence);

        String s= "Dog Dog Dog Dog Dog Dog";
        s=s.replace("Dog","Cat");
        System.out.println("s = " + s);

        String s2="Java";
        s2=s2.replace("a","e");
        System.out.println("s2 = " + s2);

        String result="Java Java Java";
        result=result.replaceFirst("Java", "Phyton");
        System.out.println("result = " + result);
        String result2="Java";
        result2=result2.replaceFirst("va","vo");
        System.out.println("result2 = " + result2);

    }
}

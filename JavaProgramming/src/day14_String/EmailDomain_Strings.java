package day14_String;

public class EmailDomain_Strings {
    public static void main(String[] args) {
        String email="Cydeo.School@gmail.com";
        String s4=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(s4);

        String str1="Java is fun, Java is cool, I love Java";
        String s1=str1.substring(0,10+1);
        System.out.println(s1);

        int beg=str1.indexOf(" J")+1;
        int end=str1.lastIndexOf(",");
        String s2= str1.substring(beg,end);
        System.out.println(s2);

        String s3=str1.substring(str1.indexOf("I"));
        System.out.println(s3);























    }
}

package day14_String;
public class StringMethod3_Substring {
    public static void main(String[] args) {
      String word="Phyton C# Ruby";
     String s1=word.substring(0,word.indexOf(" "));
     String s2=word.substring(word.indexOf(" ")+1,word.lastIndexOf(" "));
     String s3=word.substring(word.lastIndexOf(" ")+1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);























    }

}

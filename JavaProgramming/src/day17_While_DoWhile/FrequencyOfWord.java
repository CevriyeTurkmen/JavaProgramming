package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str1="JavaJavaJavaJava";
        String sentence="";
        int frequency1=0;

        for (int i = 0; i <= str1.length()-4; i++) {
String each=str1.substring(i,i+4);
if (each.equals("Java")){
frequency1++;
}


        }System.out.println(frequency1);




















}
}

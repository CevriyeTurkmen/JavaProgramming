package week06_10_15_2022;

public class CountSpecificWord {
    public static void main(String[] args) {
        String str= "Java is java in everywhere is Java";
        String word= "java";
int counter=0;
        for (int i = 0; i <= str.length()-word.length(); i++) {
String each=str.substring(i,i+word.length());
if (each.equalsIgnoreCase(word)){
    counter++;
}

        }
        System.out.println(counter);

























    }
}

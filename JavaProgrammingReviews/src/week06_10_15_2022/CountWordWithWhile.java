package week06_10_15_2022;

public class CountWordWithWhile {
    public static void main(String[] args) {
        String str="Java is java in everywhere is Java";
        String word="Java";
        int counter=0;
        word=word.toLowerCase();
        str=str.toLowerCase();

        while(str.contains(word)){
           counter++;
           str=str.replaceFirst(word,"");
        }
        System.out.println(counter);

























    }
}

package day22_MultiDimensionalArray;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence="I love Java";
        String[] word= sentence.split(" ");
          String reversedword="";

        for (int i = word[1].length()-1; i >= 0; i--) {
            reversedword+=word[1].charAt(i);

        }

        System.out.println(sentence.replace(word[1],reversedword));


















    }
}

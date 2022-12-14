package week06_10_15_2022;

public class CountWords {
    public static void main(String[] args) {
      String sentence= "Java is java in everywhere is Java";
      int counter=0;
        for (int i = 0; i <sentence.length() ; i++) {
            if (sentence.charAt(i)!=' ')
            counter++;

        } System.out.println(counter);




















    }
}

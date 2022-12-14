package Day13_Strings;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence= scan.nextLine();
      char first=sentence.charAt(0);
      char last=sentence.charAt(sentence.length()-1);
        String result= first+" "+last;
        System.out.println(result);


scan.close();
















    }
}

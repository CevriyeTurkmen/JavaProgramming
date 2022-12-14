package Day13_Strings;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
char first= word.charAt(0);
char last= word.charAt(word.length()-1);
        if (first==last){
            System.out.println("same");
        }else System.out.println("different");
scan.close();

    }
}

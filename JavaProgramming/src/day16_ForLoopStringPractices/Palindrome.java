package day16_ForLoopStringPractices;

public class Palindrome {
    public static void main(String[] args) {
/*"Java=>avaJ==>(Not Palindrome
"level"=>level==>Palindrome
 */
String word="Racecar";
String reversed="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+=word.charAt(i);

        }
        boolean isPalindrome= reversed.equalsIgnoreCase(word);
        System.out.println("isPalindrome = " + isPalindrome);































    }
}

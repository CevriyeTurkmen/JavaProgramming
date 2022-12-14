package day16_ForLoopStringPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word= "AABCCD";
        String result="";

        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            if (word.indexOf(ch)==word.lastIndexOf(ch)){
                result+=ch;

            }
        }

        System.out.println(result);























       /* Write a program that can return the unique characters from a String
        Ex:
        input:
        AABCCD
        output:
        BD
        Hint: You will need indexOf() and lastIndexOf()
        if the first and last index numbers of the character are same, then it's unique
        */

    }
}

package week04_10_01_2022;

public class CharacterType {
    public static void main(String[] args) {
        /*/* Given a character, the task is to check whether the given character is in upper case, lower case, or non-alphabetic         character

        Input: ch = 'A'
        Output: A is an UpperCase character

        Input: ch = 'a'
        Output: a is an LowerCase character

        Input: ch = '0'
        Output: 0 is not an aplhabetic character

         */

        char character = 'c';
        boolean IsUpper = character >= 'A' && character <= 'Z';
        boolean IsLower = character >= 'a' && character <= 'z';
        boolean IsNotAlphabetic = !IsLower && !IsUpper;
        String result= "";

        if (IsUpper) {
            result= (character + " Is an uppercase");
        }
        if (IsLower) {
            result= (character + " Is an lowercase");
        }
        if (IsNotAlphabetic)
            result= (character + " Is not Alphabetic character");
        System.out.println( result);

    }
}

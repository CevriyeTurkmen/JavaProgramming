package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    //reverses the given string and returns the reversed string
    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;

    }

    //checks if the given string is Palindrome,returns boolean
    public static boolean isPalindrome(String str) {

        return reverse(str).equalsIgnoreCase(str);


    }

    //checks if the given string is anagram,returns boolean
    public static boolean isAnagram(String str,String str2){

        char[] ch=str.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        return Arrays.equals(ch,ch2);

    }

    //removes the duplicates from given string,returns string
    public static String removesDuplicates(String str){
        String result="";

        for (int i = 0; i < str.length(); i++) {
           char each=str.charAt(i);
            if (!result.contains(each+"")){
                result+=each;

            }

        }
        return result;



    }


}

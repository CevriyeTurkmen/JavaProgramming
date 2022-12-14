package day01_JavaIntro;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);

        System.out.println("--------------------------------");

        String str2 = "Java";

        str2 = StringUtility.reverse(str2);

        System.out.println(str2);

        System.out.println("--------------------------------");

        String str1 = "civic";

        boolean palindrome = StringUtility.isPalindrome(str1);
        System.out.println(palindrome);

        System.out.println("---------------------------------");


        int count = 0;

        String[] names = {"Ayse", "Anna", "Javaj", "racecar", "mom"};

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }

        }
        System.out.println(count);

        System.out.println("---------------------------------------");

        String str3="abcddddd";
        String str4="bcaddddd";

        boolean vatan=StringUtility.isAnagram(str3,str4);

        System.out.println(vatan);

        System.out.println("-------------------------------------------");

        String str5="aaabbbdggg";

        str5=StringUtility.removesDuplicates(str5);

        System.out.println(str5);






















    }



}

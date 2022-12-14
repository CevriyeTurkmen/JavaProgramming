package day24_CustomMethods_Return;

public class Return_RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbbbcccd";
        str=removeDuplicates(str);
        System.out.println(str);

    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(each + "")) {
                result += each;
            }
        }
return result;
    }


}

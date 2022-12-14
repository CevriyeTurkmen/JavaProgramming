package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str1 = "Cat Cat Dog Dog cat cat";
        int frequency1 = 0;

        for (int i = 0; i <= str1.length() - 3; i++) {
            String each = str1.substring(i, i + 3);
            if (each.equalsIgnoreCase("Cat")) {
                frequency1++;
            }


        }
        System.out.println(frequency1);
    }
}
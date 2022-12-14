package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
String str= "AAABBBC";
char c='A';
int frequency=0;

        for (int i = 0;  i<=str.length()-1 ; i++) {
char eachchar= str.charAt(i);
if (c==eachchar){
    frequency++;
}

        }
        System.out.println(frequency);



















    }
}

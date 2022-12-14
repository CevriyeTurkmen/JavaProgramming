package day23_CustomMethods_Void;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        reverse("Cevriye");



    }

    public static void reverse(String word){
        String result="";
        for (int i = word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
            result=result.toLowerCase();
        }
        System.out.println(result);



    }

















}

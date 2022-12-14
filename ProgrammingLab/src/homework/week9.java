package homework;

public class week9 {
    public static void main(String[] args) {

        String str="Anne";

       str= frontBack(str);

        System.out.println(str);


    }

    public static String frontBack(String str) {

        String result="";

        for (int i = 0; i <= str.length()-1; i++) {

            char ch1=str.charAt(0);
            char ch2=str.charAt(str.length()-1);
String middle= str.substring(1,str.length()-1);
result=ch2+middle+ch1;


        }
return result;


    }


}





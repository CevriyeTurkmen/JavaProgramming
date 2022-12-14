package day16_ForLoopStringPractices;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {
        String str = "Cydeo12345School !@#$%WoodenSpoon";
        String digits = "";
        String letters = "";
        String special = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch <= 'Z' && ch >= 'A') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else
                if (ch != ' ')
                    special += ch;
            }
            System.out.println("special = " + special);
            System.out.println("letters = " + letters);
            System.out.println("digits = " + digits);


        }

    }
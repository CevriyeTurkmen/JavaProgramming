package day09_IfStatements;

public class NameOfMonths {
    public static void main(String[] args) {
        int month=6;
        String monthOfTheYear;

        if (month==1)
            monthOfTheYear="January";
        else if (month==2)
            monthOfTheYear="February";
        else if (month==3)
            monthOfTheYear="March";
        else if (month==4)
            monthOfTheYear="April";
        else if (month==5)
            monthOfTheYear="May";
        else if (month==6)
            monthOfTheYear="Jun";
        else monthOfTheYear="invalid";
        System.out.println("monthOfTheYear = " + monthOfTheYear);

        }

    }


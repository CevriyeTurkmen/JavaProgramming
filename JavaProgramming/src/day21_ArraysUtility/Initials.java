package day21_ArraysUtility;

public class Initials {
    public static void main(String[] args) {
       String[] name={"Cydeo School","Wooden Spoon","Java programming","SQL Programming","SeleniumAutomation",
               "API Testing","Database Testing","Manuel Testing"};

        for (String each : name) {
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }
















    }
}

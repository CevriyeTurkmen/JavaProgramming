package day21_ArraysUtility;

public class ReverseNames {
    public static void main(String[] args) {
        String[] name={"Cydeo School","Wooden Spoon","Java programming","SQL Programming","SeleniumAutomation",
                "API Testing","Database Testing","Manuel Testing"};

        for (String each : name) {
           String reversed="";

            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
            }
            System.out.println(reversed);
        }





















    }
}

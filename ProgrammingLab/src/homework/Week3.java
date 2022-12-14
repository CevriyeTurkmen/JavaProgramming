package homework;
public class Week3 {
    public static void main(String[] args) {

        /*Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4

         */
        int price = 55000;
        double taxRate1 = 0.2,
                taxRate2 = 0.3,
                taxRate3 = 0.4;

        if (price >= 20000 && price <= 39999) {
            System.out.println("Car Tax= " + price * taxRate1);
        } else if (price >= 40000 && price <= 59999) {
            System.out.println("Car Tax= " + price * taxRate2);
        } else System.out.println("Car Tax= " + price * taxRate3);




    }

    public static class FindTheResult {
        public static void main(String[] args) {













        }
    }
}


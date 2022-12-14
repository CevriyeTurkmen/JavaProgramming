package day35_Encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()||name.isBlank()|| name==null){
            return;
        }
        String specialChars = ""; // to get all special chars other than space

        for (char each : name.toCharArray()) {
            if(!Character.isLetterOrDigit(each) && each != ' '){  // getting all special character except for space
                specialChars += each;
            }
        }

        if(specialChars.length() > 0){ // if contains special characters other than space
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        if(!Character.isLetter(name.charAt(0))){ // if name does not start with letter
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            return;

        }
        if (name.equalsIgnoreCase("toilet paper")){
            this.quantity=1;}

        this.quantity = quantity;
    }

    public double calCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calCost()+
                '}';
    }
}

package day35_Encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size == null) {
            return;
        }

        boolean validsize = size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large");
        if (!validsize) {
            return;
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            return;
        }
        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping <= 5) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else {
            return;
        }


    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0) {
            return;
        }

        if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping <= 3) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else if (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 4) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else if (size.equalsIgnoreCase("large") && numberOfPepperoniTopping <= 5) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else {
            return;
        }
    }

    public double calcCost(){
        double price=(size.equalsIgnoreCase("small"))?10:(size.equalsIgnoreCase("MEdium"))?12:14;
        double total=price+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        return total;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", price=" + calcCost() +
                '}';
    }
}


package day32_CustomClassOverloading;

public class Carpet {

    public double width, lengths,unitPrice;
    public boolean isPersian;

    public Carpet(double width, double lengths, double unitPrice, boolean isPersian) {
        this.width = width;
        this.lengths = lengths;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", lengths=" + lengths +
                ", unitPrice= £" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= £" + calcCost() +
                '}';
    }

    public double calcCost(){
        double totalPrice= width*lengths*unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }

        return totalPrice;


    }
















}

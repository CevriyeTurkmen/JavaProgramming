package day31CustomClassConstructors;

public class Pizza {
    public char size;
    public int numberOfCheeseTopic,numberOfPepperoniTopic;

    public Pizza(char size, int numberOfCheeseTopic, int numberOfPepperoniTopic) {
        this.size = size;
        this.numberOfCheeseTopic = numberOfCheeseTopic;
        this.numberOfPepperoniTopic = numberOfPepperoniTopic;
    }

    public double calcCost(){
        double startingPrice=(size == 'S') ? 10 : (size == 'M') ? 12 : 14;
        double totalPrice=startingPrice+(numberOfCheeseTopic+numberOfPepperoniTopic)*2;
        return totalPrice;

    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopic=" + numberOfCheeseTopic +
                ", numberOfPepperoniTopic=" + numberOfPepperoniTopic +
                ", total price=" + calcCost() +
                '}';
    }
}


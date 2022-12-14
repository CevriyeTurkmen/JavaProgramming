package day38_Inheritance.carTask;

public class BMW extends Car{


    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakdown(){
        System.out.println(brand+" "+ model+ "break downs every 100 miles");
    }



}

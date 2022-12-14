package day37_Inheritance.phoneTask;

public class Iphone extends Phone {

    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }


    public void call(long phonenumber) {
        super.call(phonenumber);
    }

    public void text(long phonenumber) {
        super.text(phonenumber);
    }

    public void facetime(long phonenumber){
        System.out.println(brand+" "+model+ " is having facetime with phone number: "+ phonenumber);
    }

public void facetime(String email){
    System.out.println(brand+" "+model+ " is having facetime with email: "+ email);
}


}

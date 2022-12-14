package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("13", "plus", 1000, "blue");
        Samsung samsung = new Samsung("S19", "large", 800, "pink");
        Nokia nokia = new Nokia("Brick", "4 inches", 700, "red");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(123);
        iphone.text(12345);
        iphone.facetime("a@gmail.com");

        samsung.freeze();
        nokia.selfDefense();


    }
}

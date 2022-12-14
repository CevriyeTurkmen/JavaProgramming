package day35_Encapsulation;

public class Rectangle_Test {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);

        System.out.println(rectangle);

        rectangle.setLength(8);
        rectangle.setWidth(12);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        System.out.println(rectangle);








    }
}

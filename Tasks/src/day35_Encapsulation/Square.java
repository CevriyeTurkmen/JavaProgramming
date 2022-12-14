package day35_Encapsulation;

public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            return;
        }
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double calcArea(){
        double area=side*side;
        return area;
    }

    public double perimeter(){
        double per=4*side;
        return per;
    }

    public String toString() {
        return "Square{" +
                " side=" + side +
                " area=" + calcArea() +
                " perimeter=" + perimeter() +
                '}';
    }
}

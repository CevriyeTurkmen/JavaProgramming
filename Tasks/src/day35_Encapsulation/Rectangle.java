package day35_Encapsulation;

public class Rectangle {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calcArea(){
        return width*length;
    }

    public double calcper(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                " width=" + width +
                ", length=" + length +
                ", area" + calcArea() +
                ", perimeter=" + calcper() +
                '}';
    }
}

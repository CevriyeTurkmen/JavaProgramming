package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;

    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    public double calArea(double radius){
        return radius*radius*pi;
    }

    public double calPerimetre(double radius){
        return radius*pi*2;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Circle's perimetre=" + calPerimetre(2.5) +
                "radius=" + radius +
                '}';
    }
}

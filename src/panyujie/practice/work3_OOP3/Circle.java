package panyujie.practice.work3_OOP3;

public class Circle extends Geometry {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public String getName() {
        return "Circle";
    }

    public String toString() {
        return String.format("Circle: radius=%f\n", radius);
    }
}

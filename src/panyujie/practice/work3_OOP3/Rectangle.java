package panyujie.practice.work3_OOP3;

public class Rectangle extends Geometry {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * height;
    }

    public String getName() {
        return "Rectangle";
    }

    public String toString() {
        return String.format("Rectangle: width=%f,height=%f\n", width, height);
    }

}

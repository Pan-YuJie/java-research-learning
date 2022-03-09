package panyujie.practice.work3_OOP3;

class Triangle extends Geometry {
    private double bottom, height;

    public Triangle() {
    }

    public Triangle(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public double getBottom() {
        return bottom;
    }

    public double getArea() {
        return bottom * height / 2;
    }

    public String getName() {
        return "Triangle";
    }

    public String toString() {
        return String.format("Triangle: bottom=%f,height=%f\n", bottom, height);
    }
}
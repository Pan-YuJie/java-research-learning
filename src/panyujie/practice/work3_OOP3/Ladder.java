package panyujie.practice.work3_OOP3;

public class Ladder extends Geometry {
    private double above, bottom, height;

    public Ladder() {
    }

    public Ladder(double above, double bottom, double height) {
        this.above = above;
        this.bottom = bottom;
        this.height = height;
    }

    public double getAbove() {
        return above;
    }

    double getBottom() {
        return bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setAbove(double above) {
        this.above = above;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (this.above + bottom) * height / 2.0;
    }

    public String getName() {
        return ("Ladder");
    }

    public String toString() {  //显示对象的属�?
        return String.format("Ladder: above=%f,bottom=%f,height=%f\n", above, bottom, height);
    }
}
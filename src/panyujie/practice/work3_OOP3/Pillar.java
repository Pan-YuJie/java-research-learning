package panyujie.practice.work3_OOP3;

public class Pillar extends Geometry {
    private double height;
    private Geometry geometry;
    private double bottom;


    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Pillar() {
    }

    public Pillar(double height, Geometry geometry) {
        this.height = height;
        this.geometry=geometry;
    }

    public double getHeight() {
        return height;
    }

    public double getBasal() {
        return bottom;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBasal(Geometry geometry) {
        this.bottom = geometry.getArea();
    }

    public double getArea() {
        this.bottom=geometry.getArea();
        return height * bottom / 3;
    }

    public static double getArea(Geometry[] geometries){
        double sum=0;
        for (Geometry value : geometries) sum += value.getArea();
        return sum;
    }


    public String getName() {
        return ("Pillar");
    }

    public String toString() {
        return String.format("Pillar: height=%f,basal=%f\n",height,bottom);
    }
}

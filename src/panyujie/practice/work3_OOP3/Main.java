package panyujie.practice.work3_OOP3;

public class Main {
    public static void main(String[] args) {

        Geometry[] g=new Geometry[4];
        g[0] = new Pillar(3,new Ladder(3,3,3));
        g[1] = new Pillar(4,new Circle(3));
        g[2] = new Pillar(5,new Triangle(3,3));
        g[3] = new Pillar(5,new Rectangle(3,3));

        System.out.println(Pillar.getArea(g));
        System.out.println(ComputeAllArea.getArea(g));
    }
}

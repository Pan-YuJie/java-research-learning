package panyujie.practice.work3_OOP3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Submerge
 * Date: 2022-03-04
 * Time: 15:26
 */
public class ComputeAllArea {
    public static double getArea(Geometry[] geometries){
        double sum=0;
        for (Geometry value : geometries) sum += value.getArea();
        return sum;
    }
}

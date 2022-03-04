package panyujie.practice.work4.three.comparator;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Submerge
 * Date: 2022-03-04
 * Time: 10:35
 */
public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()- o2.getAge();
    }
}

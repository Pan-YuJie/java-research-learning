package panyujie.practice.work4.three.comparator;

import java.util.Comparator;


public class SnoComparator implements Comparator <Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSno().compareTo(o2.getSno());
    }
}

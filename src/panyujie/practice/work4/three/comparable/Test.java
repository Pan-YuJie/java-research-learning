package panyujie.practice.work4.three.comparable;

import panyujie.practice.work4.three.comparator.AgeComparator;
import panyujie.practice.work4.three.comparator.NameComparator;
import panyujie.practice.work4.three.comparator.SnoComparator;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Submerge
 * Date: 2022-03-04
 * Time: 10:10
 */
public class Test {
    public static void main(String[] args) {
        Student[] arr=new Student[4];
        arr [0]=new Student("张三","1234",44);
        arr [1]=new Student("李四","2333",64);
        arr [2]=new Student("李四","3462",33);
        arr [3]=new Student("王五","9753",13);

        //按年龄升序排序
        Arrays.sort(arr);
        for (Student tmp:arr) {
            System.out.println(tmp.toString());
        }

        //重写equals 与 hashcode
        Student student1=new Student("王五","9753",13);
        Student student2=new Student("王五","9753",13);

        System.out.println(student1.equals(student2));

    }
}

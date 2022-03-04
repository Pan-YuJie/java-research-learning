package panyujie.practice.work4.three.comparator;

import panyujie.practice.work4.three.comparator.Student;

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

        //比较器
        AgeComparator ageComparator=new AgeComparator();
        NameComparator nameComparator=new NameComparator();
        SnoComparator snoComparator=new SnoComparator();

        //按年龄升序排序
        Arrays.sort(arr,ageComparator);
        System.out.println(Arrays.toString(arr));
        //按年龄学号排序
        Arrays.sort(arr,snoComparator);
        System.out.println(Arrays.toString(arr));
        //按年龄姓名排序
        Arrays.sort(arr,nameComparator);
        System.out.println(Arrays.toString(arr));

    }
}

package panyujie.practice.work5.ArrayList;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Submerge
 * Date: 2022-03-10
 * Time: 15:03
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<Integer>();

        System.out.println(arrayList.size());

        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.remove(2);
        arrayList.print();

        arrayList.add(0,1);
        arrayList.add(2,3);
        arrayList.print();
        arrayList.set(0,2);
        arrayList.print();
        arrayList.size();

        arrayList.clear();
        arrayList.print();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Object[] tmp=arrayList.toArray();
        for (Object o:tmp) {
            System.out.print(o);
        }
        System.out.println();
        System.out.println(arrayList.get(2));


    }




}

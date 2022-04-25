package panyujie.practice.work5.MyLinkedList;

public class Test {

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList=new MyLinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(6);
        myLinkedList.add(5);
        myLinkedList.add(3);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(3);
        myLinkedList.add(6);
        myLinkedList.print();
        System.out.println("====");
        myLinkedList.remove(2);
        myLinkedList.print();
        System.out.println(myLinkedList.isContain(5));
        System.out.println(myLinkedList.isContain(9));
        myLinkedList.print();
        System.out.println("=======");
        myLinkedList.delete(2);
        myLinkedList.print();
        System.out.println("=======");
        myLinkedList.reverse();
        myLinkedList.print();
    }

}

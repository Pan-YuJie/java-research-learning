package panyujie.practice.work5.ArrayList;

import java.util.Arrays;

public class ArrayList<E> {
    private Object[] elems;
    private int next;

    public ArrayList(int capacity) {
        elems = new Object[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public boolean add(E elem) {
        if(next == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[next++] = elem;
        return true;
    }

    public void add(int index,E e){
        if(next == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        for(int i=next;i>index;i--){
            elems[i+1]=elems[i];
        }
        elems[index]=e;
        next++;
    }

    private void rangeCheck(int index) {
        if (index >= next)
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+next);
    }

    public E set(int index,E e){
        rangeCheck(index);
        elems[index]=e;
        return (E) elems[index];
    }


//    java.util.ArrayList

    public Object[] toArray() {
        return Arrays.copyOf(elems, next);
    }

    public E get(int index) {
        rangeCheck(index);
        return (E) elems[index];
    }

    public int size() {
        return next;
    }

    public boolean isEmpty() {
        return size()==0;
    }

    public boolean isContain(E e) {
        return indexOf(e) >= 0;
    }

    public int indexOf(E e) {
        if (e == null) {
            for (int i = 0; i < next; i++)
                if (elems[i]==null)
                    return i;
        } else {
            for (int i = 0; i < next; i++)
                if (e.equals(elems[i]))
                    return i;
        }
        return -1;
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (int index = 0; index < next; index++)
                if (elems[index] == null) {
                    for (int i = index; i < next-1; i++) {
                        elems[i] = elems[i + 1];
                    }
                    next--;
                    return true;
                }
        } else {
            for (int index = 0; index < next; index++)
                if (o.equals(elems[index])) {
                    for (int i = index; i < next-1; i++) {
                        elems[i] = elems[i + 1];
                    }
                    next--;
                    return true;
                }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < next; i++)
            elems[i] = null;
        next = 0;
    }

    public void print() {
        for(int i=0;i<next;i++){
            System.out.print(elems[i]);
        }
        System.out.println();
    }

}

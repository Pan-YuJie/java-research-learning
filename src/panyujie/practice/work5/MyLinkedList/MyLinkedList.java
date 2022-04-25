package panyujie.practice.work5.MyLinkedList;

class MyLinkedList<E> {
    private class Node {
        E o;
        Node next;
        Node(E o) {
            this.o = o;
        }

    }

    private Node first;

    private void checkSize(int index) throws IndexOutOfBoundsException {
        int size = size();
        if (index >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("Index: %d, Size: %d", index, size));
        }
    }

    private E findElemOf(int index) {
        int count = 0;
        Node last = first;
        while (count < index) {
            last = last.next;
            count++;
        }
        return last.o;
    }


    public void add(E e) {
        Node node = new Node(e);
        node.next = first;
        first = node;
    }

    public int size() {
        int count = 0;
        Node last = first;
        while (last != null) {
            last = last.next;
            count++;
        }
        return count;
    }

    public E get(int index) {
        checkSize(index);
        return findElemOf(index);
    }

    public void remove(E e) {
        if (isEmpty()) {
            return;
        }
        if (e.equals(this.first.o)) {
            this.first = this.first.next;
            return;
        }
        Node cur = this.first;
        while(cur.next != null) {
            if ( e.equals(cur.next.o)) {
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }

    public void delete(int index) {
        checkSize(index);
        Node last = first;
        if (index == 1) {
            first = first.next;
        } else if (index == size()) {
            while (last.next.next != null) {
                last = last.next;
            }
            last.next = null;
        } else {
            for (int i = 2; i < index; i++) {
                last = last.next;
            }
            last.next = last.next.next;
        }
    }

    public void print() {
        Node last = first;
        while (last!=null){
            System.out.println(last.o);
            last=last.next;
        }
    }

    public boolean isContain(E e) {
        Node last = first;
        while (last != null) {
            if (last.o == e) {
                return true;
            }
            last = last.next;
        }
        return false;
    }

    public Node reverse() {
        if (this.first == null || this.first.next == null){
            return first;
        }
        Node cur = null;
        Node pre = first;
        while(pre != null) {
            Node temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = temp;
        }
        first=cur;
        return cur;
    }



    public boolean isEmpty() {
        return first == null;
    }

}

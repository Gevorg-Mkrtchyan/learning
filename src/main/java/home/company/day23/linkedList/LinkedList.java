package home.company.day23.linkedList;

import java.util.Iterator;

public class LinkedList implements List {
    private int size;
    private Node head;


    private static class Node {
        private final int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean Empty() {
        return head == null;
    }

    @Override
    public int get(int index) {
        Node top = head;
        for (int i = 0; i < index; i++) {
            top = top.next;
        }
        return top.val;
    }

    @Override
    public void add(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head = newNode;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, int val) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("invalid index = " + index);
        }
        if (index == 0) {
            head = new Node(val, head);
            return;
        } else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = new Node(val, node.next);
        }
        size++;
    }

    @Override
    public void delete(int index) {
        if (index == 0) {
            head = head.next;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < this.size; i++) {
            s.append(this.get(i)).append("->");
        }
        s.append(("null]"));
        return s.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Integer> {
        Node node = head;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Integer next() {
            int value = node.val;
            node = node.next;
            return value;
        }
    }
}

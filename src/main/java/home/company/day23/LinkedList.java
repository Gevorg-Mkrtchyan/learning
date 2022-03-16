package home.company.day23;

public class LinkedList implements List {
    private int size;

    private static class Node {
        private final int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean Empty() {
        return head == null;
    }

    @Override
    public int getIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    @Override
    public void add(int val) {
        if (head == null) {
            head = new Node(val, null);
            size++;
            return;
        }
        Node node = head;
        while (node.next != null)
            node = node.next;
        node.next = new Node(val, null);
        size++;

    }

    @Override
    public void add(int index, int val) {
        if (head == null) {
            head = new Node(val, null);
            size++;
            return;
        }

        if (index == 0) {
            head = new Node(val, head);
            return;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.next = new Node(val, node.next);
        size++;

    }

    @Override
    public void delete(int index) {
        if (index == 0) {
            head = head.next;
            size--;
            return;
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
        for (int i = 0; i < this.size - 1; i++) {
            s.append(this.getIndex(i)).append("->");
        }
        s.append(this.getIndex(size - 1)).append(("->null")).append("]");
        return s.toString();
    }
}

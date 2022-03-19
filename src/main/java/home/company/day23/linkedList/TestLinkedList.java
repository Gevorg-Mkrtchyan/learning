package home.company.day23.linkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        System.out.println(linkedList);
        for (int i : linkedList) {
            System.out.println(i);
        }
    }
}

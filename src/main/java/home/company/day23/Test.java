package home.company.day23;

public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(1,6);
        linkedList.delete(2);
        System.out.println(linkedList);
    }
}

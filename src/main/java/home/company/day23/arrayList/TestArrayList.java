package home.company.day23.arrayList;

public class TestArrayList {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.contains(6));
        myArrayList.delete(3);
        for (Integer integer : myArrayList){
            System.out.println(integer);
        }
    }
}

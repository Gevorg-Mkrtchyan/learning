package home.company.day23.linkedList;

public interface List extends Iterable <Integer>{
    int size();

    boolean Empty();

    int get(int index);

    void add(int val);

    void add(int index, int val);

    void delete(int index);
}

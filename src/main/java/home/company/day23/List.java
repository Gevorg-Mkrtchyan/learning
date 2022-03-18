package home.company.day23;

public interface List extends Iterable <Integer>{
    int size();

    boolean Empty();

    int getIndex(int index);

    void add(int val);

    void add(int index, int val);

    void delete(int index);
}

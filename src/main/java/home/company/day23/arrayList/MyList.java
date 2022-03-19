package home.company.day23.arrayList;


public interface MyList extends Iterable<Integer> {
    int size();

    boolean add(int val);

    void delete(int index);

    int get(int index);

    void update(int index, int val);

    boolean isEmpty();

    boolean contains(Integer element);
}


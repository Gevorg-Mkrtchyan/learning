package home.company.day23.arrayList;

import java.util.Iterator;

public class MyArrayList implements MyList {
    private int size;
    private static final int CAPACITY = 10;
    private Integer[] value = new Integer[CAPACITY];

    @Override
    public boolean isEmpty() {
        return value.length == 0;
    }

    @Override
    public boolean contains(Integer element) {
        for (Integer integer : value) {
            if (integer.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return value.length;
    }

    public MyArrayList() {
        value = new Integer[0];
    }

    @Override
    public boolean add(int val) {
        Integer[] temp = value;
        value = new Integer[temp.length + 1];
        System.arraycopy(temp, 0, value, 0, temp.length);
        value[value.length - 1] = val;
        return true;
    }

    @Override
    public void delete(int index) {
        Integer[] temp = value;
        int count = temp.length - index - 1;
        value = new Integer[temp.length - 1];
        System.arraycopy(temp, 0, value, 0, index);
        System.arraycopy(temp, index + 1, value, index, count);
    }

    @Override
    public int get(int index) {
        return value[index];
    }

    @Override
    public void update(int index, int val) {
        value[index] = val;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator(value);
    }

    private static class ArrayIterator implements Iterator<Integer> {
        private int index;
        private final Integer[] values;

        public ArrayIterator(Integer[] values) {
            this.values = values;
        }

        @Override
        public boolean hasNext() {
            return index < values.length;
        }

        @Override
        public Integer next() {
            return values[index++];
        }
    }
}


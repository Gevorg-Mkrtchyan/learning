package home.company.day23.arrayList;

import java.util.Iterator;

public class MyArrayList implements MyList {
    private static int size;
    private static final int DEFAULT_CAPACITY = 10;
    private static Integer[] value = new Integer[DEFAULT_CAPACITY];

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
        if (index >= size)
            throw new IndexOutOfBoundsException();
        return value[index];
    }

    @Override
    public void update(int index, int val) {
        value[index] = val;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator();
    }

    private static class ArrayIterator implements Iterator<Integer> {
        private int index;

        @Override
        public boolean hasNext() {
            return index <size;
        }

        @Override
        public Integer next() {
            return value[index++];
        }
    }
}


package home.company.day26.task5;

public class DefaultPair<K, V> implements Pair<K, V> {
    K key;
    V value;

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

package lab11.task1;

import java.util.*;

public class MultiMapValue<K, V> {

    private List<MyHashMap<K, V>> list = new ArrayList<>();

    public void add(K key, V value) {
        MyHashMap<K, V> map = getKey(key);
        if (map == null) {
            map = new MyHashMap<>();
            list.add(map);
            map.setKey(key);
        }
        map.put(value);
    }

    public MyHashMap<K, V> getKey(K key) {
        for (MyHashMap<K, V> map : list) {
            if (map.getKey().equals(key)){
                return map;
            }
        }
        return null;
    }

    public void addAll(K key, List<V> values) {
        for (V value : values) {
            add(key, value);
        }
    }

    public void addAll(MultiMapValue<K, V> map) {
        for (MyHashMap<K, V> item : map.getList()) {
            addAll(item.getKey(), item.getValues());
        }
    }

    public V getFirst(K key) {
        MyHashMap<K, V> map = getKey(key);
        if (map == null) {
            return null;
        }
        return map.getValues().get(0);
    }

    public List<V> getValues(K key) {
        MyHashMap<K, V> map = getKey(key);
        if (map == null) {
            return null;
        }
        return map.getValues();
    }

    public boolean containsKey(K key) {
        for (MyHashMap<K, V> item : list) {
            if (item.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public List<V> remove(K key) {
        for (MyHashMap<K, V> item : list) {
            if (item.getKey().equals(key)) {
                list.remove(item);
                return item.getValues();
            }
        }
        return null;
    }

    public int size() {
        return list.size();
    }

    public void setList(List<MyHashMap<K, V>> list) {
        this.list = list;
    }

    public List<MyHashMap<K, V>> getList() {
        return list;
    }
}

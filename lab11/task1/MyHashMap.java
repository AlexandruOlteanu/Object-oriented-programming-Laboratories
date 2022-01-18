package lab11.task1;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> extends MultiMapValue<K, V> {

    private K key;
    private List<V> values = null;

    void put(V value) {
        if (values == null) {
            this.values = new ArrayList<>();
        }
        values.add(value);
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValues(List<V> values) {
        this.values = values;
    }

    public K getKey() {
        return key;
    }

    public List<V> getValues() {
        return values;
    }
}

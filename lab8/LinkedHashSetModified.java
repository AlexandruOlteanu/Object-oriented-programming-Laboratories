package lab8;

import java.util.LinkedHashSet;

public class LinkedHashSetModified<I extends Number> extends LinkedHashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if(integer % 2 == 0) {
            return super.add(integer);
        }
        else{
            return false;
        }
    }
}

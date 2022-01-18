package lab11.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMultiMapValue {
    private MultiMapValue<String, String> map;

    @BeforeEach
    public void setup() {
        map = new MultiMapValue<>();
    }

    @AfterEach
    public void clean() {
        map = null;
    }

    @Test
    public void testAddElementWithOneValue() {
        map.add("key", "value");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
    }

    @Test
    public void testAddElementWithMoreValues() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(2, map.getValues("key").size());
    }

    @Test
    public void testAddTwoElements() {
        map.add("key", "yes");
        map.add("secondKey", "nice");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(2, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
        Assertions.assertEquals(1, map.getValues("secondKey").size());
    }

    @Test
    public void testGetFirst() {
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("Hello");
        map.addAll("key", list);
        Assertions.assertEquals("2", map.getFirst("key"));
    }

    @Test
    public void testContainsKey() {
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("Hello");
        map.addAll("key", list);
        Assertions.assertTrue(map.containsKey("key"));
    }

    @Test
    public void testSize() {
        map.add("key", "yes");
        map.add("key", "secondYes");
        map.add("secondKey", "nice");
        Assertions.assertEquals(2, map.size());
    }

    @Test
    public void testRemoveKey() {
        map.add("key", "yes");
        map.add("key", "secondYes");
        map.add("poo", "nice");
        Assertions.assertTrue(map.containsKey("key"));
        map.remove("key");
        Assertions.assertFalse(map.containsKey("key"));
    }

    @Test
    public void testAddAllWithList() {
        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Andra");
        list.add("Hello");
        list.add("Marius");
        map.addAll("key", list);
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals("Alex", map.getFirst("key"));
    }

    @Test
    public void testAddAllWithMultiMapValue() {
        MultiMapValue<String, String> newMap = new MultiMapValue<>();
        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Andra");
        list.add("Hello");
        list.add("Marius");
        newMap.addAll("key", list);
        newMap.add("Alex", "Nota 10");
        newMap.add("Nn", "America");
        map.addAll(newMap);
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals("Alex", map.getFirst("key"));
        Assertions.assertEquals(3, map.size());
    }
}

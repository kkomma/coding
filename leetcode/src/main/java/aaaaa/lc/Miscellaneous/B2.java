package aaaaa.lc.Miscellaneous;

import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
//B2.java

public class B2 {
    public static class RandomHashMap<K, V> {
        private Map<K, V> hm;
        private List<K> keys;
        private Random generator;

        public RandomHashMap() {
            hm = new HashMap<K, V>();
            keys = new ArrayList<K>();
            generator = new Random();
        }

        public V get(K key) {
            return hm.get(key);
        }

        public void put(K key, V value) {
            if (hm.get(key) == null) {
                keys.add(key);
            }

            hm.put(key, value);
        }

        public boolean remove(K key) {
            if (hm.get(key) == null) {
                return false;
            }

            for (int i = 0; i < keys.size(); i++) {
                if (keys.get(i).equals(key)) {
                    keys.remove(i);
                }
            }

            hm.remove(key);
            return true;
        }

        public K getRandomKey() {
            if (hm.size() == 0) {
                return null;
            }

            int idx = generator.nextInt(hm.size());
            return keys.get(idx);
        }
    }

    public static void main(String[] args) {
        RandomHashMap<String, Integer> hm = new RandomHashMap<>();

        System.out.println(hm.getRandomKey());

        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        hm.put("D", 4);

        for (int i = 0; i < 5; i++) {
            System.out.println(hm.getRandomKey());
        }

        System.out.println(hm.get("C"));
        System.out.println(hm.get("A"));

        System.out.println(hm.remove("A"));
        System.out.println(hm.remove("Null"));

        return;
    }
   
}

//package aaaaa.lc.Design;
//
//import java.util.Arrays;
//import static java.util.Arrays.asList;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Map;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Random;
//import java.util.Queue;
//import java.util.Stack;
//import java.util.PriorityQueue;
//import java.util.Set;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Deque;
//import java.util.ArrayDeque;
////284_Peeking_Iterator.java
//
//public class Peeking_Iterator {
//    private Integer next;
//    private Iterator<Integer> it;
//
//    public Peeking_Iterator(Iterator<Integer> iterator) {
//        it = iterator;
//        next = it.next();
//    }
//
//    // Returns the next element in the iteration without advancing the iterator.
//    public Integer peek() {
//        return next;
//    }
//
//    // hasNext() and next() should behave the same as in the Iterator interface.
//    // Override them if needed.
//    @Override
//    public Integer next() {
//        Integer result = next;
//
//        if (it.hasNext()) {
//            next = it.next();
//        } else {
//            next = null;
//        }
//
//        return result;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return next != null;
//    }
//    public static void main(String[] args) {
//
//    }
//}

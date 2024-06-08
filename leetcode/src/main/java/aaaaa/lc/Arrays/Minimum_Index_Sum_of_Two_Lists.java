package aaaaa.lc.Arrays;

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
//599_Minimum_Index_Sum_of_Two_Lists.java

public class Minimum_Index_Sum_of_Two_Lists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> m = new HashMap<>();
        List<String> result = new ArrayList<>();
        int maxFreq = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            m.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            if (m.containsKey(list2[i])) {
                int rating = m.get(list2[i]) + i;

                if (rating <= maxFreq) {
                    if (rating != maxFreq) {
                        result.clear();
                    }
                    result.add(list2[i]);
                    maxFreq = rating;
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }
    public static void main(String[] args) {

    }
}

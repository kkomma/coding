package aaaaa.lc.Strings;

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
//49_Group_Anagrams.java

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return Collections.emptyList();
        }

        Map<String, List<String>> hm = new HashMap<>();

        for (String s : strs) {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);

            String keyStr = String.valueOf(sArr);
            if (!hm.containsKey(keyStr)) {
                hm.put(keyStr, new ArrayList<>());
            }

            hm.get(keyStr).add(s);
        }

        return new ArrayList<List<String>>(hm.values());
    }
    public static void main(String[] args) {

    }
}

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
//387_First_Unique_Character_In_String.java

public class First_Unique_Character_In_String {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }

        HashMap<Character, Integer> hmChar = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmIdx = new HashMap<Character, Integer>();
        char[] sArray = s.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            hmChar.put(sArray[i], hmChar.getOrDefault(sArray[i], 0) + 1);
            hmIdx.put(sArray[i], hmIdx.getOrDefault(sArray[i], i));
        }

        for (Character c : sArray) {
            int frequency = hmChar.get(c);
            if (frequency == 1) {
                return hmIdx.get(c);
            }
        }

        return -1;
    }
    public static void main(String[] args) {

    }
}

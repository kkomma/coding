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
//Y1.java


public class Y1 {
    public static List<String> topColour(String[][] image) {
        List<String> result = new LinkedList<String>();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int highestFrequency = 0;

        if (image == null || image[0] == null) {
            return result;
        }

        for (String[] row : image) {
            for (String s : row) {
                int wordFrequency = hm.getOrDefault(s, 0) + 1;
                hm.put(s, wordFrequency);
                highestFrequency = Math.max(highestFrequency, wordFrequency);
            }
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == highestFrequency) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        String[][] imageOne = new String[][] { { "red", "red", "green" }, { "black", "blue", "black", },
                { "red", "yellow", "yellow" } };
        String[][] imageTwo = new String[][] { { "red", "green", "green" }, { "black", "blue", "black", },
                { "red", "yellow", "yellow" } };

        List<String> listImageOne = topColour(imageOne);
        List<String> listImageTwo = topColour(imageTwo);

        System.out.println(listImageOne);
        System.out.println(listImageTwo);
        return;
    }
    
}

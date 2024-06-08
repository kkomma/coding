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
//13_Roman_To_Integer.java

public class Roman_To_Integer {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] nums = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
            case 'M':
                nums[i] = 1000;
                break;
            case 'D':
                nums[i] = 500;
                break;
            case 'C':
                nums[i] = 100;
                break;
            case 'L':
                nums[i] = 50;
                break;
            case 'X':
                nums[i] = 10;
                break;
            case 'V':
                nums[i] = 5;
                break;
            case 'I':
                nums[i] = 1;
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            // Subtract the current indexes value if the preceeding
            // value is greater, ie. cases like IX (9), IV (4) etc
            if (nums[i] < nums[i + 1]) {
                sum -= nums[i];
            } else {
                sum += nums[i];
            }
        }

        // Always add the final index since there are no more after it to compare,
        // ie. III, the final index will be I, which is 1
        // or LVIII, the final index will be I, which is also 1
        return sum + nums[nums.length - 1];
    }
    public static void main(String[] args) {

    }
}

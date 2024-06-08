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
//345_Reverse_Vowels_of_a_String.java

public class Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String vowels = "aeiouAEIOU";
        char[] sArr = s.toCharArray();
        int start = 0, end = s.length() - 1;

        while (start < end) {
            while (start < end && vowels.indexOf(sArr[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(sArr[end]) == -1) {
                end--;
            }

            char temp = sArr[start];
            sArr[start++] = sArr[end];
            sArr[end--] = temp;
        }

        return new String(sArr);
    }
    public static void main(String[] args) {

    }
}

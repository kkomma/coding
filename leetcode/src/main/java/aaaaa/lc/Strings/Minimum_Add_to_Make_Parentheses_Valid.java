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
//921_Minimum_Add_to_Make_Parentheses_Valid.java

public class Minimum_Add_to_Make_Parentheses_Valid {
    public int minAddToMakeValid(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }

        int result = 0;
        Stack<Character> s = new Stack<>();

        for (char c : S.toCharArray()) {
            if (c == '(') {
                s.push(c);
            } else if (s.isEmpty()) {
                ++result;
            } else {
                s.pop();
            }
        }

        return result + s.size();
    }
    public static void main(String[] args) {

    }
}

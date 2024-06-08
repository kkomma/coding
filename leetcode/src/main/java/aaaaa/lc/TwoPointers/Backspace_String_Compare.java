package aaaaa.lc.TwoPointers;

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
//844_Backspace_String_Compare.java

public class Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        String sTrimmed = trimString(s);
        String tTrimmed = trimString(t);

        return sTrimmed.equals(tTrimmed);
    }

    private String trimString(String str) {
        StringBuilder sb = new StringBuilder();
        int hyphenCnt = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '#') {
                hyphenCnt++;
            } else {
                if (hyphenCnt == 0) {
                    sb.append(str.charAt(i));
                } else {
                    hyphenCnt--;
                }
            }
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {

    }
}

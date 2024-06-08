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
//127_Word_Ladder.java

public class Word_Ladder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();
        int level = 1;

        q.offer(beginWord);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                char[] letters = q.poll().toCharArray();

                for (int j = 0; j < letters.length; j++) {
                    char tmp = letters[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        letters[j] = c;

                        String modifiedWord = new String(letters);

                        if (dict.remove(modifiedWord)) {
                            if (modifiedWord.equals(endWord)) {
                                return ++level;
                            }
                            q.offer(modifiedWord);
                            dict.remove(modifiedWord);
                        }
                    }

                    letters[j] = tmp;
                }
            }

            ++level;
        }

        return 0;
    }
    public static void main(String[] args) {

    }
}

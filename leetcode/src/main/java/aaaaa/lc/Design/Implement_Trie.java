package aaaaa.lc.Design;

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
//208_Implement_Trie_(Prefix Tree).java

public class Implement_Trie {
	
    private Map<Character, TrieNode> children;
    private boolean isWord;

    public Implement_Trie() {
        children = new HashMap<>();
        isWord = false;
    }

    public boolean isWord() {
        return isWord;
    }

    public void isFullWord() {
        isWord = true;
    }

    public void putCharIfAbsent(char c) {
        children.putIfAbsent(c, new TrieNode());
    }

    public TrieNode getChild(char c) {
        return children.get(c);
    }
    
}

//class Trie {
//    private TrieNode root;
//
//    /** Initialize your data structure here. */
//    public Trie() {
//        root = new TrieNode();
//    }
//
//    /** Inserts a word into the trie. */
//    public void insert(String word) {
//        if (word == null) {
//            return;
//        }
//
//        TrieNode curr = root;
//        for (char c : word.toCharArray()) {
//            curr.putCharIfAbsent(c);
//            curr = curr.getChild(c);
//        }
//
//        curr.isFullWord();
//    }
//
//    /** Returns if the word is in the trie. */
//    public boolean search(String word) {
//        if (word == null) {
//            return false;
//        }
//
//        TrieNode curr = root;
//
//        for (char c : word.toCharArray()) {
//            curr = curr.getChild(c);
//
//            if (curr == null) {
//                return false;
//            }
//        }
//
//        return curr.isWord();
//    }
//
//    /**
//     * Returns if there is any word in the trie that starts with the given prefix.
//     */
//    public boolean startsWith(String prefix) {
//        if (prefix == null) {
//            return false;
//        }
//
//        TrieNode curr = root;
//
//        for (char c : prefix.toCharArray()) {
//            curr = curr.getChild(c);
//            if (curr == null) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}

package aaalme.stringproblems;

import java.util.HashSet;
import java.util.Set;
public class LargestSubstringWithoutRepeatChars {
    /**
     * Returns the length of the largest substring without repeating characters.
     */
    public static int largestSubstringWithoutRepeatChars(String s) {
        // Use a HashSet to store unique characters
        Set<Character> charSet = new HashSet<>();
        int l = 0; // left pointer of the sliding window
        int res = 0; // result

        for (int r = 0; r < s.length(); r++) { // right pointer of the sliding window
            // If the character at the right pointer is already in the set,
            // move the left pointer to the right until it's not in the set
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            // Add the character at the right pointer to the set
            charSet.add(s.charAt(r));
            // Update the result with the maximum length of the substring
            res = Math.max(res, r - l + 1);
        }
        return res;
    }    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(largestSubstringWithoutRepeatChars(s)); // Output: 3 ("abc")

        s = "bbbbb";
        System.out.println(largestSubstringWithoutRepeatChars(s)); // Output: 1 ("b")

        s = "aabaaa";
        System.out.println(largestSubstringWithoutRepeatChars(s)); // Output: 2 ("ab")

        s = "baaaaa";
        System.out.println(largestSubstringWithoutRepeatChars(s)); // Output: 2 ("ba")
    }
}
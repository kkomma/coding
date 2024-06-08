package aaalme.stringproblems;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int left = 0; // Initialize left pointer
        int ans = 0; // Initialize answer
        Map<Character, Integer> currChars = new HashMap<>(); // Map to store counts of characters
        
        for (int right = 0; right < s.length(); right++) { // Iterate through s using right pointer
            char c = s.charAt(right);
            currChars.put(c, currChars.getOrDefault(c, 0) + 1); // Increment count of current character
            
            while (currChars.size() > k) { // If number of distinct characters exceeds k
                char leftChar = s.charAt(left);
                currChars.put(leftChar, currChars.get(leftChar) - 1); // Decrement count of character at left pointer
                if (currChars.get(leftChar) == 0) {
                    currChars.remove(leftChar); // Remove character from map if its count becomes zero
                }
                left++; // Move left pointer to the right
            }
            
            ans = Math.max(ans, right - left + 1); // Update answer with length of current substring
        }
        
        return ans; // Return the length of the longest substring with at most k distinct characters
    }
    
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(lengthOfLongestSubstringKDistinct(s, k)); // 3
        
        s = "aa";
        k = 1;
        System.out.println(lengthOfLongestSubstringKDistinct(s, k)); // 2
        
        s = "a";
        k = 1;
        System.out.println(lengthOfLongestSubstringKDistinct(s, k)); // 1
        
        s = "a";
        k = 0;
        System.out.println(lengthOfLongestSubstringKDistinct(s, k)); // 0
        
        s = "a";
        k = 2;
        System.out.println(lengthOfLongestSubstringKDistinct(s, k)); // 1
    }
}
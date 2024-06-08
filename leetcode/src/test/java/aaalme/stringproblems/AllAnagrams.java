package aaalme.stringproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagrams {
    public static List<List<String>> findAllAnagrams(List<String> strings) {
        Map<String, List<String>> anagrams = new HashMap<>();
        
        for (String string : strings) {
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            
            if (!anagrams.containsKey(sortedString)) {
                anagrams.put(sortedString, new ArrayList<>());
            }
            
            anagrams.get(sortedString).add(string);
            System.out.println("map: " + anagrams);
        }
        
        List<List<String>> result = new ArrayList<>();
        for (List<String> values : anagrams.values()) {
            if (values.size() > 1) {
                result.add(values);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "dog", "tac", "god", "act");
        List<List<String>> allAnagrams = findAllAnagrams(strings);
        System.out.println(allAnagrams);
    }
}

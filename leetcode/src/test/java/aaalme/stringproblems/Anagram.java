package aaalme.stringproblems;

public class Anagram {
    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("anagram", "nagaram")); // True
        System.out.println(checkAnagram("kasi", "iukas")); // True
//        System.out.println(checkAnagram("rat", "car")); // False
//        System.out.println(checkAnagram("a", "a")); // True
//        System.out.println(checkAnagram("ab", "a")); // False
//        System.out.println(checkAnagram("a", "ab")); // False
//        System.out.println(checkAnagram("a", "b")); // False
//        System.out.println(checkAnagram("a", "")); // False
//        System.out.println(checkAnagram("", "a")); // False
//        System.out.println(checkAnagram("", "")); // True
    }
}
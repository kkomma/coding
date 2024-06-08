package aaalme.stringproblems;

import java.util.ArrayList;
import java.util.List;

public class StringCompressionHard {
    public static void main(String[] args) {
        String s = "appleincorporated";
        List<Character> a = new ArrayList<>();

        for (char c : s.toCharArray()) {
            a.add(c);
        }
        System.out.println(a);

        System.out.println(countOccurrences(s, 'e'));

        String t = "al223pha4345?nums!";

        List<Character> nums = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        List<Character> nonAlnums = new ArrayList<>();

        for (char c : t.toCharArray()) {
            if (Character.isDigit(c)) {
                nums.add(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                nonAlnums.add(c);
            }
        }

        System.out.println(nums);
        System.out.println(letters);
        System.out.println(nonAlnums);
    }

    private static int countOccurrences(String s, char target) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
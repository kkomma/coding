package aaalme.stringproblems;

public class LongestStringAfterSubstitution {
    public static int characterReplacement(String s, int k) {
        int curLen = 0;
        int l = 0;
        int r = 0;
        int maxVar = 0;
        int[] arrVals = new int[26];  // Assuming only uppercase English characters

        while (r < s.length()) {
            arrVals[s.charAt(r) - 'A']++;
            maxVar = Math.max(maxVar, arrVals[s.charAt(r) - 'A']);

            if (r - l + 1 - maxVar > k) {
                arrVals[s.charAt(l) - 'A']--;
                l++;
            }

            curLen = Math.max(curLen, r - l + 1);
            r++;
        }

        return curLen;
    }

    public static void main(String[] args) {
        String s = "ABBB";
        int k = 2;
        System.out.println(characterReplacement(s, k));

        s = "AAABABB";
        k = 1;
        System.out.println(characterReplacement(s, k));

        s = "XYYX";
        k = 2;
        System.out.println(characterReplacement(s, k));

        s = "AAAB";
        k = 0;
        System.out.println(characterReplacement(s, k));
    }
}
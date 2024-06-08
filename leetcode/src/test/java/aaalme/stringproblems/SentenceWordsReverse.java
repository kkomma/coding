package aaalme.stringproblems;

import java.util.Arrays;
import java.util.List;

public class SentenceWordsReverse {
	
    public static String reverseWordsInSentence(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        // Collections.reverse(words);
        // return String.join(" ", words);
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            char[] chars = word.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            words.set(i, new String(chars));
        }

        return String.join(" ", words);
    }

   
    public static void main(String[] args) {
        String inputString = "we dev    loop";
        System.out.println("len before"+inputString.length());
        String reversedString = reverseWordsInSentence(inputString);
        System.out.println("len after"+reversedString.length());
        System.out.println(reversedString);

       
    }
}
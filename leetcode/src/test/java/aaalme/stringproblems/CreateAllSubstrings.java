package aaalme.stringproblems;

import java.util.ArrayList;
import java.util.List;

public class CreateAllSubstrings {
    public static List<String> generateSubstrings(String string) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                substrings.add(string.substring(i, j));
            }
        }
        return substrings;
    }

    public static void main(String[] args) {
        String string = "Hello";
        List<String> substrings = generateSubstrings(string);
        System.out.println(substrings);
    }
}
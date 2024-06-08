package abc.interview.a.anotes;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("kasi","isak"));
		System.out.println(isAnagram("aarmy","maryA"));
	}

	private static boolean isAnagram(String str1, String str2) {
		char[] a = str1.toLowerCase().toCharArray();
		char[] b = str2.toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a,b);
		//return Arrays.toString(a).toLowerCase().equals(Arrays.toString(b).toLowerCase());
	}

}

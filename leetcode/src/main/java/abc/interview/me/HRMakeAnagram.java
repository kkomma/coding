package abc.interview.me;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HRMakeAnagram {
	public static void main(String[] args) {
		System.out.println(numberNeeded1("kassi", "viswrra"));
	}

	private static int numberNeeded1(String string1, String string2) {
		char[] a = string1.toCharArray();
		char[] b = string2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		Character[] ss = new Character[string1.toCharArray().length];		
		for(Character s: string1.toCharArray()){
			ss[string1.indexOf(s)] = s;
		}
		Character[] ss1 = new Character[string2.toCharArray().length];		
		for(Character s1: string2.toCharArray()){
			ss1[string2.indexOf(s1)] = s1;
		}
		List<Character> l1 = Arrays.asList(ss);
		List<Character> l2 = Arrays.asList(ss1);
		// Prepare a union
		List<Character> union1 = new ArrayList<Character>(l1);
		union1.addAll(l2);
		// Prepare an intersection
		List<Character> intersection1 = new ArrayList<Character>(l1);
		intersection1.retainAll(l2);
		// Subtract the intersection from the union		
		union1.removeAll(intersection1);		
		for (Character nn : union1) {
			System.out.println("char not common::"+nn);
		}

		int count = 0;
		String s1 = string1.concat(string2);
		System.out.println(s1);
		for(char cc: intersection1){			
			int cnt = 0;
			cnt = occurenses(s1, cc);
			System.out.println(cc+":::"+cnt);
			count = count + cnt;
		}		
		System.out.println("final count::"+count);
		return union1.size();

	}

	private static int occurenses(String s1, char cc) {		
		int count = 0 ;		
		for(Character c: s1.toCharArray()){
			if(c.equals(cc)){
				count++;
			}
		}

		return count;
	}

	private static int numberNeeded(String string1, String string2) {
		char[] a = string1.toCharArray();
		char[] b = string2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		Character[] ss = new Character[string1.toCharArray().length];		
		for(Character s: string1.toCharArray()){
			ss[string1.indexOf(s)] = s;
		}

		Character[] ss1 = new Character[string2.toCharArray().length];		
		for(Character s1: string2.toCharArray()){
			ss1[string2.indexOf(s1)] = s1;
		}


		List<Character> l1 = Arrays.asList(ss);
		List<Character> l2 = Arrays.asList(ss1);
		// Prepare a union
		List<Character> union1 = new ArrayList<Character>(l1);
		union1.addAll(l2);
		// Prepare an intersection
		List<Character> intersection1 = new ArrayList<Character>(l1);
		intersection1.retainAll(l2);
		// Subtract the intersection from the union
		union1.removeAll(intersection1);
		// Print the result
		for (Character nn : union1) {
			System.out.println("char not common::"+nn);
		}
		System.out.println();
		System.out.println("=========jjj===============");		
		List<Character> list1111 = Arrays.asList(ss);
		System.out.println(list1111.toString());
		System.out.println("========================");		
		int n = a.length > b.length ? a.length: b.length;
		List<char[]> list11 = Arrays.asList(a);
		List<char[]> list22 = Arrays.asList(b);

		// Make the two lists
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(2, 3, 4, 6, 7);
		// Prepare a union
		List<Integer> union = new ArrayList<Integer>(list1);
		union.addAll(list2);
		// Prepare an intersection
		List<Integer> intersection = new ArrayList<Integer>(list1);
		intersection.retainAll(list2);
		// Subtract the intersection from the union
		union.removeAll(intersection);
		// Print the result
		for (Integer nn : union) {
			System.out.println(nn);
		}

		System.out.println("========================");
		List<String> al = new ArrayList<>();
		// add elements to al, including duplicates
		Set<String> hs = new HashSet<>();
		hs.addAll(al);
		al.clear();
		al.addAll(hs);

		System.out.println("========================");

		return 1;
	}
}

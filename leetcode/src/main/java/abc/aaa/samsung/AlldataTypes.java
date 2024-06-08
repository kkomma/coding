package abc.aaa.samsung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

import sun.misc.Queue;
import static java.util.Arrays.asList;
public class AlldataTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		Set<Integer> linkedhashset = new LinkedHashSet<>();
		Set<Integer> treeset = new TreeSet<>();
		Set<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

		Map<Integer,Integer> map = new HashMap<>();
		Map<Integer,Integer> linkedhashmap = new LinkedHashMap<>();
		Map<Integer,Integer> treemap = new TreeMap<>();
		Map<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();

		ArrayList<Integer> arrayList = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		LinkedList<Integer> linkedlist = new LinkedList<>();
		Queue<Integer> queue = new Queue<>();		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("AAAABBBCCDAA");
		sb.replace(2, 4, "");
		
		String sss = sb.toString();
		System.out.println(sss);
		
		List<Integer> m = asList(1,2,3,3);
		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		String s = "ABC";
		char[] ss = s.toCharArray();
		List<Character> cc = new ArrayList<>();
		for(int i=0; i < ss.length; i++) {
			cc.add(ss[i]);
		}
		System.out.println(Arrays.toString(m.toArray(new Integer[0])));
		System.out.println(Arrays.toString(cc.toArray(new Character[0])));
		System.out.println(Arrays.toString(l.toArray(new String[0])));
	}	
}

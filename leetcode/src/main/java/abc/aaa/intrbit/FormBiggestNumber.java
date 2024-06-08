package abc.aaa.intrbit;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FormBiggestNumber {

	public static String largestNumber(final List<Integer> a) {
		List<String> strs = new ArrayList<String>();
		for(Integer i : a){
			strs.add(String.valueOf(i));
		}

		Collections.sort(strs, new MyCompartor());

		StringBuffer strBuf = new StringBuffer();
		for(String s : strs){
			if("0".equals(s) && strBuf.length() != 0) {
				continue;   
			}
			strBuf.append(s);
		}

		return strBuf.toString();
	}

	public static void main(String[] args) {
		
		List<Integer> a = asList(3, 30, 34, 5, 9);
		System.out.println(largestNumber(a));

		
	}

}

class MyCompartor implements Comparator<String>{
	@Override
	public int compare(String s1, String s2){
		String first = s1 + s2;
		String second = s2 + s1;
		return second.compareTo(first);
	}
}
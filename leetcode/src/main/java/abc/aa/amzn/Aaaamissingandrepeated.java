package abc.aa.amzn;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Aaaamissingandrepeated {

	public static void main(String[] args) {
		List<Integer> a = asList(1,3,2,3,5);
		System.out.println(missingNrepeated((a)));
	}

	private static ArrayList<Integer> missingNrepeated(final List<Integer> intList) {
		ArrayList<Integer> out = new ArrayList<Integer>();
		double l = intList.size();
		double sum = (l*(l+1))/2;
		long sumA = 0;
		int a=0;
		HashSet<Integer> ASet = new HashSet<Integer>();
		for(int i=0;i<intList.size();i++) {
			if(ASet.contains(intList.get(i))) {
				a=intList.get(i);
			}
			ASet.add(intList.get(i));
			sumA = sumA+intList.get(i);
		}
		double diff =  sum - sumA;
		System.out.println("diff::"+diff);
		int b = a + (int)diff;
		System.out.println("repeated no:"+a);
		System.out.println("missing no:"+b);
		out.add(a);
		out.add(b);
		return out;
	}

}


package abc.interview.me;

import java.util.ArrayList;
import java.util.Iterator;

public class ListToString {

	public static void main(String[] args) {

		ArrayList<Character> a = new ArrayList<Character>();			
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');		
		System.out.println(a.toString());
		
		StringBuilder sb = new StringBuilder();		
		Iterator<Character> b = a.iterator();		
		while(b.hasNext()){
		sb.append(b.next());	
		}		
		System.out.println(sb.toString());

		
		ArrayList<String> aa = new ArrayList<String>();			
		aa.add("aa");
		aa.add("bb");
		aa.add("cc");
		aa.add("dd");		
		System.out.println(aa.toString());
		
		StringBuilder sb1 = new StringBuilder();		
		Iterator<String> bb = aa.iterator();		
		while(bb.hasNext()){
		sb1.append(bb.next()+" ");	
		}		
		System.out.println(sb1.toString());

		
		
	}

}

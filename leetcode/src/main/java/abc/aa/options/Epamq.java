package abc.aa.options;

import java.util.ArrayList;
import java.util.List;

public class Epamq {

	public static void main(String[] args) {
		searchArray();
	}

	private static void searchArray() {
		String[] str = {"abc", "def", "ace", "ac","lll","#$%$"};
		Character[] chars = {'a','c'};		
		List<String> ll = new ArrayList<>();		
		for(String s: str) {
			int count = 0 ;
			for(Character c: chars) {
				if(s.contains(""+c)) {
					count++;
					if(count == chars.length) {
						ll.add(s);
					}
				}else {
					break;
				}
			}	
		}
		System.out.println(ll.toString());
	}

}

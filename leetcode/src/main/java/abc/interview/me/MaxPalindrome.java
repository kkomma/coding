package abc.interview.me;

import java.util.HashMap;
import java.util.Map;

public class MaxPalindrome {

	static void palindrome(){

		String s = "aabcbcbdcc";	
		char[] c = s.toCharArray();

		Map<Character, Integer> cc = new HashMap<Character, Integer>();

		for(Character ss: c){
			if(cc.containsKey(ss)){
				cc.put(ss, cc.get(ss) + 1);
			}else{
				cc.put(ss, 1);
			}		
		}
		boolean singleChar = true;
		int sum = 0;
		for(Map.Entry<Character, Integer> ff:cc.entrySet()){			
			if(ff.getValue() % 2 == 0 ){	
				sum = sum + ff.getValue();
				System.out.println("palin::"+ff.getKey()+":::"+ff.getValue());	
			}else if(ff.getValue() > 2){
				System.out.println("palin::"+ff.getKey()+":::"+(ff.getValue() - 1));
				sum = sum + (ff.getValue() -1 );
			}else if(ff.getValue() == 1 && singleChar){
				System.out.println("palin::"+ff.getKey()+":::"+(ff.getValue()));	
				singleChar = false;
				sum = sum + ff.getValue();
			}
		}
		System.out.println("max string length is::"+sum);
	}
	public static void main(String[] args) {
		palindrome();
	}

}

package abc.interview.me;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoStringsSameChar {

	static Map<Character, Integer> maxOc(String s){

		char[] c = s.toCharArray();

		Map<Character, Integer> cc = new HashMap<Character, Integer>();

		for(Character ss: c){
			if(cc.get(ss) != null){
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

		return cc;
	}

	static void stringoccurences(){

		//String str = "HELLO WORLD!";
		//String str = "HMMMMO MMMMMMMHELLO";
		String str = "K LK";

		String[] s = str.split(" ");
		Map<Character, Integer> m1 = maxOc(s[0]);
		Map<Character, Integer> m2 = maxOc(s[1]);

		for(Character ccc: m1.keySet()){
			System.out.println("m1 key set::"+ccc);
		}
		for(Map.Entry<Character, Integer> ff:m1.entrySet()){			
			System.out.println("m1 palin::"+ff.getKey()+":::"+ff.getValue());
		}
		for(Character ccc: m2.keySet()){
			System.out.println("m2 key set::"+ccc);
		}
		for(Map.Entry<Character, Integer> ff:m2.entrySet()){			
			System.out.println("m2 palin::"+ff.getKey()+":::"+ff.getValue());
		}

		int yy = 0;
		Character j = null;		
		Iterator<Character> keyFirstItr1 = m1.keySet().iterator();
		while (keyFirstItr1.hasNext()) {
			Character keyTemp = keyFirstItr1.next();			
			if (m1.get(keyTemp) != null && m2.get(keyTemp) != null) {
			    int zz  =  m1.get(keyTemp) - m2.get(keyTemp) > 0 ? m1.get(keyTemp): m2.get(keyTemp);
			    if(yy == 0){
			    	yy = zz;		
			    	j = keyTemp;
			    }else if(yy < zz){
			    	yy = zz;
				    j = keyTemp;
			    }
			}
		}		
		System.out.println("key::value::"+yy+":::"+j);
	}
	public static void main(String[] args) {
		stringoccurences();
	}
}

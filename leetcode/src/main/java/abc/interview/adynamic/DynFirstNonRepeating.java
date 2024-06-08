package abc.interview.adynamic;

import java.util.LinkedHashMap;
import java.util.Map;

// Create an algorithm to find the first non repetitive   character in words like 'television' and 'arizona' 
/* Name of the class has to be "Main" only if the class is public. */
public class DynFirstNonRepeating
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		/******************
		******************
		*Character based indexing
		*
		*
		******************/
		String s = "televisiont";
		int[] c = new int[255];		
		
		for(int i=0;i<s.length();i++){
			c[s.charAt(i)]++;
			System.out.println(c[s.charAt(i)]+":::"+s.charAt(i));
		}
		for(int i=0;i<s.length();i++){
			if(c[(int)s.charAt(i)]==1){
				System.out.println(s.charAt(i));
				break;
			}
		}
		
		Map<Character, Integer> ff = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++){
		    ff.put(s.charAt(i), c[s.charAt(i)]);
			System.out.println("count:::"+c[s.charAt(i)]+":::"+s.charAt(i));
		}
		
		for(Map.Entry<Character, Integer> cc : ff.entrySet()){
			System.out.println(cc.getKey()+"::::"+cc.getValue());
		}

		
	}
}
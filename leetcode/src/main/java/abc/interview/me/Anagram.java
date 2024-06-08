package abc.interview.me;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Anagram {

	static boolean isAnagram(String s1, String s2){
		for(int i=0; i < s1.length(); i++){				
			boolean isAng = false;			
			for(int j=0; j < s2.length(); j++){
				if(s1.charAt(i) == s2.charAt(j)){
					isAng = true;
				}
			}
			if(!isAng){
				return isAng;
			}
		}
		return true;

	}

	public static boolean isAnagramm(String s1 , String s2)
	{
		String delStr="";
		String newStr="";

		for(int i=0;i<s1.length();i++)
		{
			for(int j=0 ; j < s2.length() ; j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					delStr=s1.substring(i,i+1);
					newStr=s2.replace(delStr,"");
				}
			}           
		}

		if(newStr.equals("")) {
			System.out.println("yes it is anagram");
			return true;
		} else {
			System.out.println("no it is not anagram");
			return false;
		}
	}

	public static boolean isAna(String s1 , String s2) {

		if(s1.length() != s2.length()) {
			return false;
		}
		boolean flag = true;
		StringBuilder sb = new StringBuilder(s2);
		char[] c = s1.toCharArray();
		for(int i=0; i < c.length ;i++) {
			if(s2.indexOf(c[i]) != -1) {
				sb.deleteCharAt(s2.indexOf(c[i]));				
				s2 = sb.toString();				
			}else {
				flag=false;
				break;
			}
		}
		return flag;
	}


	public static void isAnagramme(String s1 , String s2)
	{

		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		char[] c2 = s2.toCharArray();
		Arrays.sort(c2);

		if(Arrays.equals(c1,c2)) {
			System.out.println("anagrams me");
		}else {
			System.out.println("anagrams not me");
		}
	}


	public static void main(String[] args) {		

		//isAnagramme("kasi","isak");
		System.out.println(isAna("kasikk","kkaks"));
		Queue<Character> priorityqueueNames1 = new PriorityQueue<>();		
		for(Character s: "kasg".toCharArray()){
			priorityqueueNames1.add(s);
		}		   
		//priorityqueueNames1.forEach(name -> System.out.println(name));
		System.out.println("==================================");
		Queue<Character> priorityqueueNames2 = new PriorityQueue<>();		 
		for(Character s: "sakgshi".toCharArray()){
			priorityqueueNames2.add(s);
		}		   
		//priorityqueueNames2.forEach(name -> System.out.println(name));


		/*	System.out.println(priorityqueueNames1);
		System.out.println(priorityqueueNames2);

		for(Object ss: priorityqueueNames2.toArray())
		{
			System.out.println("queue to array::"+ss);
		}*/


	}

}

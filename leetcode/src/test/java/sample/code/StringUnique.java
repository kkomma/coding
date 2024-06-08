package sample.code;

import java.util.HashSet;
import java.util.Set;

public class StringUnique{

	private static String uniqueCharsString(String str){

		char[] charArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();

		for(int i=0; i < charArr.length;i++){
			if(!set.contains(charArr[i])){
				set.add(charArr[i]);
				sb.append(charArr[i]);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args){
		System.out.println(uniqueCharsString("banana"));
		System.out.println(uniqueCharsString("hello"));
		System.out.println(uniqueCharsString(""));
	}

}
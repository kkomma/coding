package aaabigdata;

public class StringManipulation {


	public static void main(String[] args){

		String[] ss= {"baaaaa","baaabbaabbba","baabab"};

		for (String s: ss) {
			System.out.println(charsToDelete(s));

		}

	}

	public static int charsToDelete(String s){

		int deleteCount = 0;
		char[] charsInString = s.toCharArray();
		for(int i=2;i<s.length();i++){
			if (charsInString[i] == charsInString[i-1] && charsInString[i-1] == charsInString[i-2])
			{
				deleteCount +=1;
				i = i+2;
			}
		}

		return deleteCount;
	}


}

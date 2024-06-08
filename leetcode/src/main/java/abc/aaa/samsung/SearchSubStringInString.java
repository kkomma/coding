package abc.aaa.samsung;

public class SearchSubStringInString {

	private static int findSubString(String wholeString, String subString){
		char[] a = wholeString.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(int i=0; i< a.length; i++){
			if(sb.append(a[i]).toString().contains(subString)){        
				++count;
				sb = new StringBuilder();
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String wholeString = "nordstromnordincnord";
		String subString = "no";
		System.out.println(findSubString(wholeString,subString));
	}

}

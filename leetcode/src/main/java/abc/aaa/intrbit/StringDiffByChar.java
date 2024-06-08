package abc.aaa.intrbit;

public class StringDiffByChar {

	public static void main(String[] args) {		
		String s1 = "aassri";
		String s2 = "aajssri";
		System.out.println("ret::"+charbychar(s1,s2));		
	}

	private static char charbychar(String s1, String s2) {
		Character c = ' ';
		char[] cc = s1.length() > s2.length() ? s1.toCharArray() : s2.toCharArray();
		char[] dd = s1.length() > s2.length() ? s2.toCharArray() : s1.toCharArray();		
		int[] seen = new int[300];
		for(char d: dd) {
			seen[d]++;
		}		
		for(char d: cc) {
			System.out.println(d+"::"+seen[d]);
			if(seen[d]-- < 1) {
				return d;
			}
		}
		return c;
	}
}

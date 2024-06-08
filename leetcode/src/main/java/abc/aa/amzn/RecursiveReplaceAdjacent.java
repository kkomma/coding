package abc.aa.amzn;

public class RecursiveReplaceAdjacent {

	public static void main(String[] args) {
		String s = "abaabac" ;
		System.out.println(recursiveReplace(s));
	}

	private static String recursiveReplace(String s) {
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder(s);
		for(int i=1; i < c.length; i++) {
			if(c[i-1]==c[i]) {
				sb.delete(i-1, i+1);
				return recursiveReplace(sb.toString());
			}
		}
		return sb.toString();
	}

}

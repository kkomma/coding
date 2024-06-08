package abc.aa.amzn;

public class CompressString {

	public static void main(String[] args) {
		String s = "aabbbcddl";
		System.out.println(compressString(s, s.length()));
	}

	private static String compressString(String s, int length) {
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count = 1 ;
		for(int i = 1; i < length; i++) {
			if(chars[i-1] == chars[i]) {
				count++;
			}else {
				if(count > 1) {				
					sb.append(count);
				}				
				sb.append(chars[i-1]);
				count = 1;
			}
		}
		if(count > 1) {
		   sb.append(count);
		}
		sb.append(s.charAt(length-1));
		return sb.toString();
	}

}

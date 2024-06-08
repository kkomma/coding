package abc.interview.llds;

public class StringReverse {

	static void rev(String str) {		
		StringBuilder sb = new StringBuilder();		
		char[] c = str.toCharArray();		
		for(int i = c.length -1; i >=0; i--) {
			sb.append(c[i]);
		}		
	    System.out.println("sb reverse methe:"+sb.toString());
	}
		
	public static void main(String[] args) {		
		String str = "this is java";
		System.out.println("method called");
		rev(str);		
		StringBuilder sb = new StringBuilder(str);		
		System.out.println("sb reverse built:"+sb.reverse());		
		String s = "123";
		System.out.println("integer:"+Integer.parseInt(s));		
		char c = 'A';		
		System.out.println("char int:"+(int)c);
		c = 'a';		
		System.out.println("char int:"+(int)c);
	}

}

package abc.interview.a.anotes;

public class RotateStr {

	public static void main(String[] args) {
		String str = "This is a test";
		//"stThis is a te";		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();

		for(int i = 0; i < str.length();i++) {
			if(i < str.length() - 2 ) {
				sb.append(str.charAt(i));   
			}else {
				sb1.append(str.charAt(i));
			}		 
		}		
		System.out.println(sb1.toString().concat(sb.toString()));	    
		int rotate = 29;
		int index = rotate % str.length();
		System.out.println("rotate times:"+index);

		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();		
		str = "This is a test";		
		String[] ss = str.split(" ");

		for(int i = 0; i < ss.length;i++) {
			if(i < ss.length - index ) {
				sb3.append(ss[i]); 
				sb3.append(" ");
			}else {
				sb4.append(ss[i]);
				sb4.append(" ");
			}		 
		}		
		String s = sb4.toString().concat(sb3.toString());
		s = s.substring(0, s.lastIndexOf(" "));
		System.out.println(s);
	}
	
}

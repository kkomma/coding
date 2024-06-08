package abc.interview.ajava8;

public class GreaterVersion {

	public static void main(String[] args) {

		String s1 = "3.4..6.a";
		String s2 = "3.4.5.b";
		System.out.println(s1.compareTo(s2));
		int a = getVersionTotal(s1);
		int b = getVersionTotal(s2);
		if(a>b) {
			System.out.println("version a greater");			
		}else if(a == b){
			System.out.println("versions are equal");			
		}else {
			System.out.println("version b greater");			
		}
	}

	private static int getVersionTotal(String s1) {
		int v = 0;
		for(Character c: s1.toCharArray()) {
			if(Character.isDigit(c)) {
				v = v + Character.getNumericValue(c);
			}else {
				System.out.println(c+"::"+(int)c);
				v = v + (int) c;
			}
		}
		return v;
	}

}

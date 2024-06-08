package abc.aaa.ikmteksys;

public class Stringsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "My String";
		String str2 = new String("My String");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.matches(str2));
		//System.out.println(String.parse(str1) == str2);
		System.out.println(str1.hashCode() == str2.hashCode());
		System.out.println(str1 == str2);
		
	}

}

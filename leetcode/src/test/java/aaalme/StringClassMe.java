package aaalme;

public class StringClassMe {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
		sb.append(charArray, 0, 2);
		System.out.println(sb.toString()); // Outputs: "Hello"
		
		StringBuilder sb1 = new StringBuilder();
		sb1.appendCodePoint(65); // 65 is the ASCII value of 'A'
		System.out.println(sb1.toString()); // Outputs: "A"
		
		StringBuilder sb2 = new StringBuilder("Hello, World!");
		sb2.delete(7, 13); // Deletes "World" from the StringBuilder
		System.out.println(sb2.toString()); // Outputs: "Hello, !"
		
		String str = "Hello World";
		String substring = str.substring(6,11); // Returns "World"
		System.out.println(substring);
		
		
	}

}

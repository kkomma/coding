package abc.aa.amzn;

import java.util.Scanner;

public class ReplaceCharinString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		Character c1 = s3.charAt(0);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(c1);
		StringBuilder sb = new StringBuilder();
		for(Character c: s1.toCharArray()) {
			if(c == c1) {
				sb.append(s2);
			}else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		sc.close();
		
	}

}

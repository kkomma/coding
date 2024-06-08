package abc.interview.a.anotes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AaaadataTypes {

	public static void main(String[] args) throws IOException {
/*
		List<Integer> l = asList(1,4,23,2,3,44);
		Collections.reverse(l);		
		System.out.println(l.toString());
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.readLine() != null) {
			System.out.println(br.readLine());			
		}
		
		br.close();
		/*Scanner in = new Scanner(System.in);
		String str = null;
		while(in.hasNext()) {
			str = in.nextLine();
			System.out.println(str);
			str = str.concat(str);
		}
		in.close();
		System.out.println(str);
		*/
	}

}

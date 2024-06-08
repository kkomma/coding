package abc.interview.llds;

import java.util.Enumeration;

public class SystemParams {

	public static void main(String[] args) {
		Enumeration<?> s = System.getProperties().propertyNames();			
		while(s.hasMoreElements()) {
			System.out.println(s.nextElement());
		}
	}

}

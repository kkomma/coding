package abc.interview.me;

public class CharNumSum {

	public static void main(String[] args) {

		String s = "as237";		
		char[] c = s.toCharArray();
		int sum = 0;
		for(int i=0; i < c.length; i++){
			Character t= c[i];
			if(Character.isDigit(t)){
				sum = sum + Character.getNumericValue(t);
			}
		}
		System.out.println("c::"+sum);
	}

}

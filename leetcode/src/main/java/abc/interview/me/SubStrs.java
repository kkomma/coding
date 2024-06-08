package abc.interview.me;

public class SubStrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Expected text value ' ' but was ' ' ";
	
		if(!(str.contains("Expected element tag name 'value' but was 'attribute'")					
		||str.contains("Expected text value ' '"))){
			System.out.println("inner loop"+str);
			
		}else{
			System.out.println("outer loop"+str);

		}
		
		
		
		
	}

}

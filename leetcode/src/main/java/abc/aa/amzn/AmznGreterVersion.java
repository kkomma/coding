package abc.aa.amzn;

public class AmznGreterVersion {

	static int retVerSum(String str) {
		int sum1 = 0;		
		for(Character c: str.toCharArray()){			
			if(Character.isDigit(c)){
				sum1 = sum1 + Character.getNumericValue(c);
			}else{
				sum1 = sum1 + ((int)c);
			}
		}
		return sum1;
		
	}
	
	static String greaterVersion(String str1, String str2){		
		return retVerSum(str1) < retVerSum(str2) ? str2 : str1;		
	}	
        
	public static void main(String[] args) {	
		System.out.println(greaterVersion("3.0.4.1a", "3.0.4.2"));
		System.out.println(greaterVersion("3.0.4.1a", "3.0.4.1b"));
		System.out.println(greaterVersion("amznaws", "amzn"));
		int ss = 65;
		System.out.println((char) ss);
		Character c = 'a';
		System.out.println((int) c);
		Character d = 'k';
		System.out.println((int) d);
	}
}

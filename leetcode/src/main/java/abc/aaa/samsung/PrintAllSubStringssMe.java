package abc.aaa.samsung;

public class PrintAllSubStringssMe {

	public static void main(String[] args) {
		String str = "kaaklll";		
		int maxLenSofar = 0;
		String maxString = null;
		
		for(int i=0;i < str.length(); i++) {
			for(int j=i+1;j <= str.length(); j++) {
				String s = str.substring(i,j);				
				System.out.println(s);				
				if(isPalin(s)) {				
					if(maxLenSofar < s.length()) {
						maxLenSofar = s.length();
						maxString = s;
					}
				}
			}
		}		
		System.out.println("str::"+maxString);
	}

	private static boolean isPalin(String s) {
        StringBuilder sb = new StringBuilder(s);        
        return sb.reverse().toString().equals(s);
	}

}

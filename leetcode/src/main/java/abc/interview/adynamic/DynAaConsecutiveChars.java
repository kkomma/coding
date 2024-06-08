package abc.interview.adynamic;

public class DynAaConsecutiveChars {


	static void countChars(String s){

		int maxCharCnt = 0;
		char maxChar =' ';
		char prevChar=' ';
		int curCharCnt = 0;		
		char curChar=' ';

		for(int i=0; i< s.length(); i++){
			
			curChar = s.charAt(i);	
			System.out.println("curChar::"+curChar);

			if(prevChar == ' '){
				prevChar=curChar;
			}
			
			if(curChar == prevChar){
				curCharCnt++;
				System.out.println("curCharCnt::"+curCharCnt);
			}

			if(curChar != prevChar || i==s.length()-1){
				System.out.println("assnment loop1");	
				curCharCnt++;
				if(curCharCnt > maxCharCnt){
					maxCharCnt = curCharCnt;
					maxChar = prevChar;	
					
				}	
				curCharCnt = 0;
			}
			prevChar = curChar;
			System.out.println("prevChar::"+prevChar);
		}
		System.out.println(maxCharCnt+":::"+maxChar);
	}
	
	public static void main(String[] args) {
		countChars("affhrggffffrrrrrrrrrrrrffyrrrrrrrr");
	}

}

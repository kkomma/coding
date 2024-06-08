package abc.interview.me;


import java.util.*;

public class FibanaciPrimeDupChar {

	static int fib(int i){
		if(i ==1 || i ==2){      
			return 1;
		}    
		return fib(i-1)+fib(i-2);  
	}

	static void dupchar(String str){

		char[] characters = str.toCharArray();    
		for(char aa:characters){
			System.out.print(aa);
		}      

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
	   for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}    
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.println();
		List<String> ss = Arrays.asList("","");
		System.out.printf("List of duplicate characters in String '%s' %n", str); 
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}

	}

	static void prime(int n){        
		//loop through the numbers one by one
		for(int i=1; i < n; i++){
			boolean isPrime = true;
			//check to see if the number is prime
			for(int j=2; j < i ; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			// print the number
			if(isPrime){
				System.out.print(i + " ");
			}
		}
	}

	static int digSum(int n)
	{
		int sum = 0;    
		while(n > 0 || sum > 9)
		{
			if(n == 0)
			{
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {    
		System.out.println(digSum(4333434));
		for(int i = 1; i <=10; i++){
			System.out.print(fib(i)+ " ");
		}
		System.out.println();
		dupchar("javaprogram");    
		prime(20);
	}
}


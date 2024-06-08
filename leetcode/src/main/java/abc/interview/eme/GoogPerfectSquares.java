package abc.interview.eme;

import java.util.Stack;

public class GoogPerfectSquares {

	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<Integer>();		
		for(int i=0; i<10;i++){
			stk.push(i);	
		}

		int count = 0;
		Stack<Integer> stk1 = new Stack<Integer>();		
		for(int i= 31991 ; i < 99380&&count<6 ; i++){
			int g = i * i;					
			while(g>0){
				stk1.push(g%10);
				g = g /10;			
			}			
			boolean bol = stk1.containsAll(stk);
			if(bol){
				System.out.println(stk1.toString());	
				count++;
			}
			stk1.clear();
		}

		//once you pop stack it will be empty// so becareful if you have to work on stack further this for loop
		while(!stk.isEmpty()){
			System.out.println(stk.pop());
		}

	}

}

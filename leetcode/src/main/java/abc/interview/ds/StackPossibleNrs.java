package abc.interview.ds;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class StackPossibleNrs {
	static LinkedList<Integer> retstack(int i){		
		LinkedList<Integer> stack = new LinkedList<Integer>();		
		while(i>0){
			stack.push(i%10);
			i = i /10;			
		}
		return stack;	
	}
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter unique number:::");
		String strLine = in.readLine();
		in.close();
		
		int n = Integer.parseInt(strLine);		
		
		LinkedList<Integer> stack = retstack(n);
		
		
		for(int i = (int) Math.pow(10.00,stack.size() - 1); i < (int) Math.pow(10.00,stack.size()); i++){			
			LinkedList<Integer> stack1 = retstack(i);
			if(stack1.containsAll(stack)){
				System.out.println(i);
			}			
		}		
	}
}

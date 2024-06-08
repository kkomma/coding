package abc.interview.eme;

import java.io.IOException;
import java.util.Stack;

public class GoogBalanceStringParanthesis {
	public static void main( String args[]) throws IOException {
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.readLine() != null){			
		}*/
		//Scanner sc = new Scanner(System.in);
		//String str = sc.next();
		String str = "(()(()";    	
		System.out.print(balanceParanthesis(str).toString());
	}

	private static StringBuilder balanceParanthesis(String str) {

		Stack<Character> stack = new Stack<>();
		Stack<Integer> stackPos = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < str.length() ; i++){
			char curr = str.charAt(i);			
			System.out.println(curr);
			switch (curr)  {
			case '(' : 
				stack.push('(');
			    stackPos.push(sb.length());
				System.out.println("sb len::"+sb.length());
			break;
			case ')' :
				if (stack.size() != 0) { // stack size will always be 1 as it is getting poped in this block
					char ch = stack.pop();
					int pos = stackPos.pop();
					System.out.println("sb::"+sb.toString());
					System.out.println(ch+":::"+pos);
					sb.insert(pos , ch);
					sb.append(')');
				}
				break;
			default:
				System.out.println("default case");
				sb.append(curr);
			}
		}
		return sb;
	}
}
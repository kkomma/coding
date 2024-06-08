package abc.interview.me;

import java.util.Stack;

public class DecimalBinary {

	public static void main(String[] args) {

		
		System.out.println("Binary representation of 124: ");
    	System.out.println(Integer.toBinaryString(124));
        System.out.println("\nBinary representation of 45: ");
        System.out.println(Integer.toBinaryString(45));
        System.out.println("\nBinary representation of 999: ");
        System.out.println("Decimal To String::"+Integer.toBinaryString(999));
        System.out.println("Decimal To String::"+Integer.toHexString(999));

        int num = 123;
        int y = num;
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
          binary[index++] = num%2;
          num = num/2;
        }
		System.out.println("Binary representation offf "+y);
        for(int i = index-1;i >= 0;i--){
          System.out.print(binary[i]);
        }
        
        num = 123;      
     // Create Stack object
        Stack<Integer> stack = new Stack<Integer>();
        while (num > 0)
        {
          int d = num % 2;
          stack.push(d);
          num /= 2;
        } 
     
        System.out.print("\nBinary representation is:");
        while (!(stack.isEmpty() ))
        {
          System.out.print(stack.pop());
        }
        System.out.println();
      }

}

package abc.interview.me;

public class HRLonelyInteger {
    
	//XOR
	
    public static int lonelyInteger(int[] a) {
        int result = 0;
        for(int i : a) {
            result = result ^ i;
        }    
        return result;
    }
    
    public static void main(String[] args) {
 
    	//bits not nullied themselves each in the column
        int[] a = {1,2,3,2,1};
        System.out.println(lonelyInteger(a));
    }
}
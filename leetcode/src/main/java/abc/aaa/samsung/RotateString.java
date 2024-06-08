package abc.aaa.samsung;

public class RotateString {

	private static void leftRotate(String str, int offset) {
		 char[] A = str.toCharArray();
	     int len = A.length;
	     if(len>0) {
	    	 offset = offset % len;	 
	     }
	     
	     reverse(A, 0, len - offset - 1);
	     reverse(A, len - offset, len - 1);
	     reverse(A, 0, len - 1);
	     StringBuilder sb = new StringBuilder();
	     for(int i=0;i<A.length;i++) {
	    	 sb.append(A[i]);
	     }
	     System.out.println("rotated string:"+sb.toString());
	}
	
	private static void rightRotate(String str, int offset) {
		leftRotate(str, str.length() - offset);
	}

		
	public static void main(String[] args) {
		//String str = "abcdef"; 
		String str = "this is the test class";
		leftRotate(str, 2);
		str = "this is the test class";
		rightRotate(str, 4);
	     
	}

	private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}

package abc.interview.adynamic;

public class DynConsecutiveMaxSum {

	static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0){
            	max_ending_here = 0;
            }    
            else if (max_so_far < max_ending_here){
            	max_so_far = max_ending_here;
            }                
                      
        }
        return max_so_far;
    }
	
	
	public static void main(String[] args) {
		int a[]= {-10, 2, 33,-2,0,5,-15};
		System.out.println(maxSubArraySum(a));
	}

}

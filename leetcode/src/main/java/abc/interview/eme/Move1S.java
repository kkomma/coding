package abc.interview.eme;

public class Move1S {

	/*Function to put all 0s on left and all 1s on right*/
	void segregate0and1(int arr[], int size) 
	{
		/* Initialize left and right indexes */
		int left = 0, right = size - 1;

		while (left < right) 
		{			
			System.out.println("1111111111111");
			/* Increment left index while we see 0 at left */
			while (arr[left] == 0 && left < right)
				left++;
			System.out.println("00000000000");
			/* Decrement right index while we see 1 at right */
			while (arr[right] == 1 && left < right)
				right--;

			/* If left is smaller than right then there is a 1 at left
               and a 0 at right.  Exchange arr[left] and arr[right]*/
			if (left < right) 
			{
				System.out.println("left::"+left);
				System.out.println("right::"+right);
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
	}

	/* Driver Program to test above functions */
	public static void main(String[] args)
	{
		Move1S seg = new Move1S();
		int arr[] = new int[]{0,0, 1, 1,0, 1, 1,0, 1,1,0,0,1};
		int i, arr_size = arr.length;
		seg.segregate0and1(arr, arr_size);
		System.out.print("Array after segregation is ");
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}

package abc.interview.me;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeletionFromArray {

	
	static void removeElementt() {
			String[] str_array = {"item1","item2","item3", "item2"};
			List<String> list = new ArrayList<String>(Arrays.asList(str_array));
			list.remove("item2");
			str_array = list.toArray(new String[0]);
			for(int i=0; i < str_array.length; i++){
				System.out.println(str_array[i]);
			}
	}
			
	static void removeElement(int [] arr, int elem) {
		int length = 0;		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != elem){
				System.out.println("len value::"+arr[length]);
				arr[length++] = arr[i];
			}
		}
		
		//System.out.println("final lenght arrays::"+Arrays.toString(arr));
		System.out.println(Arrays.toString(Arrays.copyOf(arr, length)));
			
	}

	public static void main(String[] args) {
		int input[] = {20, 4, 2, 4, 3};
		 removeElement(input, 4);
		 removeElementt();
	}
}


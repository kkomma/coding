/*package abc.interview.me;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

public class RmEleArray {

	public static void main(String[] args) {
		int[] n = {1,2,3,5,3,6,7};		
		int[] m = ArrayUtils.remove(n, 3);
		System.out.println(m.length);

		//second version
		String[] str_array = {"item1","item2","item3", "item2"};
		List<String> list = new ArrayList<String>(Arrays.asList(str_array));
		list.remove("item2");
		str_array = list.toArray(new String[0]);

		for(int i=0; i < str_array.length; i++){
			System.out.println(str_array[i]);
		}

		//third version
		Integer[] str_array1 = {1,2,3,5,3,6,7};
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(str_array1));		

		Collections.sort(list1, Collections.reverseOrder());
		for (int i : list1){
			list1.remove(i);
		}
		for(int i=0; i < list1.size(); i++){		
		System.out.println(list1.get(i));		
		}				 

		for(int i=0;i<list1.toArray().length; i++){
			System.out.println("list to arr::"+list1.get(i));
		}

		ArrayList<Integer> gg = new ArrayList<Integer>();
		Iterator<Integer> it1 = list1.iterator();
		while (it1.hasNext() ) {
			int value = it1.next();
			if (value == 3 ) {
				gg.add(9);
			}else{
				gg.add(value);
			}
		}
		
		for(Integer i: gg){
			System.out.println("repalce 3 wtih 9::"+i);
		}
		

		
		Iterator<Integer> it = list1.iterator();
		while (it.hasNext() ) {
			int value = it.next();
			if (value == 3 ) {
				it.remove();
			}
		}


		for(int i=0; i < list1.size(); i++){		
			System.out.println(list1.get(i));		
		}	


	}
}
*/
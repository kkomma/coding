package abc.interview.ajava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class MapJava8Sort {

	public static void main(String[] args) {

		int[] array = {2,55,3,88,9,10};

		for(int i=0; i<array.length/2; i++)
		{ 	
			System.out.println("i value::"+i);
			int temp = array[i]; 
			array[i] = array[array.length -i -1]; 
			array[array.length -i -1] = temp;
		}

		for(int i= 0 ; i <array.length; i++){
			System.out.println(array[i]);
		}



		String[] typesOfInsurance = {"Life Insurance", "Car Insurance", "Health Insurance"}; 
		System.out.println("array before reverse: " + Arrays.toString(typesOfInsurance) ); 
		List<String> listOfProducts = Arrays.asList(typesOfInsurance); 
		Collections.reverse(listOfProducts);
		//String[] reversed = listOfProducts.toArray(typesOfInsurance); 
		//System.out.println("array after reverse: " + Arrays.toString(reversed) ); 
		System.out.println("array after reverse: " + listOfProducts);

		Map<String, Integer> unsortMap = new LinkedHashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.out.println("Original...");
		System.out.println(unsortMap);

		// sort by keys, a,b,c..., and return a new LinkedHashMap
		// toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
		Map<String, Integer> result = unsortMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(
						Collectors.toMap(
								Map.Entry::getKey, 
								Map.Entry::getValue,
						        (oldValue, newValue) -> oldValue, 
						        LinkedHashMap::new
						)
						);

		Map<String, Integer> result1 = unsortMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println("Sorted...");
		System.out.println("result:"+result);	
		System.out.println("result1:"+result1);	        
		
		unsortMap.entrySet().stream()
		.sorted(reverseOrder(Map.Entry.comparingByValue()))
		.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	} 
}





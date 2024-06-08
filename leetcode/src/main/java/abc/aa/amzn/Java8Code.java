package abc.aa.amzn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

interface Vehicle {
	default void print(){
		System.out.println("I am a vehicle!");
	}
	static void blowHorn(){
		System.out.println("Blowing horn!!!");
	}
}


public class Java8Code implements Vehicle {
	public void printtt(){
		Vehicle.super.print();	
		Vehicle.blowHorn();
	}
	

	public static void main(String[] args) {
		Java8Code jj = new Java8Code();
		jj.printtt();
		
		Random random = new Random();//.ints().limit(1).findFirst().getAsInt();
		random.ints(1,20).limit(10).forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squaresList.toString());
		
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		System.out.println(strings.toString());

		
	}
	
	private void sortUsingJava8(List<String> names){
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

}

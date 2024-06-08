package abc.interview.ds;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOperations {

	public static void main(String[] args) {

		
		List<String> listNames = Arrays.asList("Alice", "Bob", "Cole", "Dale","Eric", "Frank");
		Queue<String> queueNames = new LinkedList<>(listNames);
		System.out.println(queueNames);
		
		queueNames.add("Mary");
		queueNames.add("John");
		System.out.println(queueNames);

	    System.out.println("=====================");

		for (String name : queueNames) {
		    System.out.println(name);
		}
	    System.out.println("=====================");
	    queueNames.forEach(name -> System.out.println(name));
	    System.out.println("=====================");

		Queue<String> queueCustomers = new LinkedList<>();
		queueCustomers.offer("Jack");		 
		String next = queueCustomers.remove();
		System.out.println("Next customer is: "+ next);
		
		List<Integer> intss = Arrays.asList(3,1,2,6,4,66,4,99);
		Queue<Integer> queueInts = new LinkedList<>(intss);
		
		System.out.println("=====================");

		for (Integer name : queueInts) {
		    System.out.println(name);
		}
	    System.out.println("=====================");
		 
		
	    Queue<String> priorityqueueNames = new PriorityQueue<>();
	    
	    priorityqueueNames.add("Dale");
	    priorityqueueNames.add("Bob");
	    priorityqueueNames.add("Frank");
	    priorityqueueNames.add("Alice");
	    priorityqueueNames.add("Eric");
	    priorityqueueNames.add("Cole");
	    priorityqueueNames.add("John");
	     
	    priorityqueueNames.forEach(name -> System.out.println(name));
	    	    
        Queue<Integer> priorityqueueNos = new PriorityQueue<Integer>();	    
        priorityqueueNos.add(2);
        priorityqueueNos.add(1);
        priorityqueueNos.add(9);
        priorityqueueNos.add(8);        
        int y = Integer.MIN_VALUE;	     
        priorityqueueNos.forEach(name -> System.out.println(name));
	}

}

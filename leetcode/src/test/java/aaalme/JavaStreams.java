package aaalme;

import java.util.*;
import java.util.stream.*;

public class JavaStreams {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Alice", 30, "New York"), new Person("Bob", 20, "Los Angeles"),
				new Person("Charlie", 25, "New York"), new Person("David", 40, "Chicago"));
		System.out.println("***************printing age > 20**************");
		// Filter, map, sort, and collect
		List<String> names = people.stream().filter(person -> person.getAge() > 20).map(Person::getName).sorted().collect(Collectors.toList());				
		names.forEach(System.out::println);

		System.out.println("****");
		// Find the oldest person
		Optional<Person> oldestPerson = people.stream().max(Comparator.comparing(Person::getAge));
		oldestPerson.ifPresent(person -> System.out.println("Oldest Person: " + person));

		// Group by city
		Map<String, List<Person>> peopleByCity = people.stream().collect(Collectors.groupingBy(Person::getCity));
		peopleByCity.forEach((city, peopleInCity) -> {
			System.out.println("People in " + city + ": " + peopleInCity);
		});

		// Calculate total and average age
		IntSummaryStatistics ageStatistics = people.stream().collect(Collectors.summarizingInt(Person::getAge));
		System.out.println("Total Age: " + ageStatistics.getSum());
		System.out.println("Average Age: " + ageStatistics.getAverage());
	}
}

class Person {
	private String name;
	private int age;
	private String city;

	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}";
	}
}
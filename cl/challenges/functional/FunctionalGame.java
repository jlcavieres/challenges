package cl.challenges.functional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalGame {
	
	
	
	public static void main(String[] args) {
		
		
		
		/*
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Predicate<Integer> isEven = n -> n % 2 == 0;

		List<Integer> evenNumbers = numbers.stream()
		    .filter(isEven)
		    .collect(Collectors.toList());

		System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]
		
		toUpperCase();
		
		*/
		
		
		HashMap<String, String> hashMap = new HashMap<>();

        String key = "mutableKey";
        hashMap.put(key, "value");

        System.out.println("Before mutation: " + hashMap.get(key));

        key = "mutableKey"; // Mutating the key

        System.out.println("After mutation: " + hashMap.get(key));
		
	}
	
	public static void toUpperCase() {
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

	    // Using map to convert each word to uppercase
	    List<String> uppercaseWords = words.stream()
	                                      .map(String::toUpperCase)
	                                      .collect(Collectors.toList());

	    System.out.println("Original List: " + words);
	    System.out.println("Uppercase List: " + uppercaseWords);
		
		
	}

}

package cl.challenges.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalGame {
	
	
	
	public static void main(String[] args) {
		
		
		findUnique();

		
		/*
		List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "tomato"));
		
		
		System.out.println("Before call for chance "+ words.hashCode() );
		words.forEach(v -> System.out.println(v));
		System.out.println("");
		
		
		// words.stream().forEach((v) -> System.out.println(v));
		
		toUpperCase(words);	
		
		System.out.println("After call for change "+ words.hashCode() );
		words.forEach((v) -> System.out.println(v));
		System.out.println("");
		*/
        		
	}
	
	
	/**
	 * 
	 * Rescatar los números que solo están presentes 1 vez 
	 * 
	 */
	public static void findUnique() {
		
		Integer[] numbers = {1,2,2,3,4,5,5,6,6};
		
		
		// How to convert a simple array to a List)
	    List<Integer> listNumber = Arrays.asList(numbers);
	    
	    
	    // Agrupar dentro de un "Collectors"
	    Map<Integer, Long> occurrences = listNumber.stream()
	    		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    
	    
	    /*
	    List<Integer> uniqueNumbers = occurrences.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
	     */                
	    
	    
	    // new Person("name 1", 30, "male")
	    
	    
	    // DESAFÍO: Mapear a una lista de otro tipo
	    // Se comenta que el map es un mal nombre porque simplemente aplica una función, pero en realidad es muy util para mapear el resultad	    
	    List<Person> uniqueNumbers = occurrences.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> new Person("name "+ entry.getValue(), entry.getKey(), "name "+ entry.getValue()))  
                .collect(Collectors.toList());
	    
	    uniqueNumbers.forEach(entry ->  System.out.println(entry.getName().concat(" "+ entry.getAge())));

        System.out.println("Unique numbers: " + uniqueNumbers.toString());
		
	}
	
	
	public static void toUpperCase(List<String> words) {
		
		System.out.println("inside the call, clean "+ words.hashCode() );

	    // Using map to convert each word to uppercase
	    List<String> uppercaseWords = words.stream()	
	                                      .map(String::toUpperCase)
	                                      .collect(Collectors.toList());
	    
	    System.out.println("New uppercase list "+ uppercaseWords.hashCode() );
	    System.out.println("Uppercase List: " + uppercaseWords);
	    System.out.println("");
	    
	    // words = uppercaseWords;
	    
	    words.add("cucumber");
	    
	    System.out.println("inside the call after re-asigment"+ words.hashCode() );

	    // System.out.println("Original List: " + words);
	    // System.out.println("Uppercase List: " + uppercaseWords);
	}

}

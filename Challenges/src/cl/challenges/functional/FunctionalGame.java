package cl.challenges.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalGame {
	
	
	
	public static void main(String[] args) {

		List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "tomato"));
		
		
		System.out.println("Before call for chance "+ words.hashCode() );
		words.forEach(v -> System.out.println(v));
		System.out.println("");
		
		
		// words.stream().forEach((v) -> System.out.println(v));
		
		toUpperCase(words);	
		
		System.out.println("After call for change "+ words.hashCode() );
		words.forEach((v) -> System.out.println(v));
		System.out.println("");
        		
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

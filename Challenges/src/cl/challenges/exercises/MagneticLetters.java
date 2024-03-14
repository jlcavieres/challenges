package cl.challenges.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MagneticLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean allUsed = check("SAM", "JOHN", "JOXHSNAM");
		
		System.out.println("All letter "+ (allUsed ? "wasn't" : "was")  + " used");		

	}
	
	
	public static boolean check(String word1, String word2, String universe) {
		
	  // 1: how to turn an array into a hashmap
	  
	  List<String> universeList = wordToLetters(universe);
	  
	  List<String> w1List = wordToLetters(word1);
	  List<String> w2List = wordToLetters(word2);	  


	  // 3: How to count elements in a array list
	  Map<String, Long> universeCount = universeList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	  
	  System.out.println("Letter counts before: " + universeCount);
	  
      // subtract letter from word 1 and 2
	  
	  // 4: Combine arrays (notice the inmutable chance, isn't neccesary to use adittional variable)
	  w1List.addAll(w2List);	  
	  w1List.sort(Comparator.reverseOrder());
	  
	  
	  // w1List contains all the elemens
	  for (String l : w1List) {
		  
		  if (universeCount.getOrDefault(l, 0L) != 0L ) {
			  
			  System.out.println("letter: " + l +" "+ universeCount.get(l));
		  
		  		// one element less
		  		universeCount.replace(l, universeCount.get(l) - 1);
		  		
			}		  		  
	  }
	  
	  System.out.println("Letter counts after: " + universeCount);
	  
	  // Count where value > 0
	  long count = universeCount.values().stream().filter(v -> v > 0).count();
	  
	  System.out.println(" > 0: " + count);
	  
	  return (count > 0);		
	}
	
	private static List<String> wordToLetters(String word) {

		  List<String> letters =  new ArrayList<>();
		
		  // 2: How to split a string into letters
		  for (char l : word.toCharArray()) {		  
			  letters.add(Character.toString(l));
		  }
		  
		  return letters; 
		
	}

}

package cl.challenges.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsPlay {
	
	
	public static void main(String[] args) {
		
		// sumItems();		
		// combineMaps();
		
		countEmtyStringInList();

	}
	
	/**
	 * Challenge, sumatory of items from a collection using a lambda expresion
	 *  
	 */
	
	public static void sumItems() {
		
		int sum = 0;
		
		HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("a", 1);
        hashMap1.put("b", 3);
        hashMap1.put("c", 8);
        
        System.out.println("hashMap1 values prior forEach: "+ hashMap1);
		
		
		// Technique 1
		// Using stream API
		
		// Technique 2
		// Using hashmap foreach
		
		// No se puede !!, la variable sum no tiene contexto
		// hashMap1.forEach((key, value) -> sum += value);
		
        
        sum = hashMap1.values().stream().reduce(0, (subtotal, value) -> subtotal + value);
        
        // reduce no modifica el contenido
        System.out.println("hashMap1 values post forEach: "+ hashMap1);
        
        // System.out.println("Size: " + hashMap1.size());        
        System.out.println("hashMap1 sumatoria: "+ sum);		
	}
	
	
	public static void countEmtyStringInList() {
		
		int sum = 0;
		
		List<String> lista = new ArrayList<>(List.of("hola", "hi", "", "chiao", ""));
		
		
		// long countEmpty = lista.stream().filter( i -> i.length() == 0).count(); // usando un count nativo del stream
		long countEmpty = lista.stream().filter( i -> i.length() == 0).collect(Collectors.counting()); // usando un collector
         
        
        System.out.println("calculado por stream hay : "+ countEmpty +" items");
	}
	
	
	
	/**
	 * Challenge, merge two list
	 *  
	 */
	
	public static void combineMaps() {
		
		int sum = 0;
		
		HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("a", 1);
        hashMap1.put("b", 3);
        hashMap1.put("c", 8);
        
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap1.put("d", 13);
        hashMap1.put("e", 8);
        hashMap1.put("f", 9);
        
        
        // Simple merge using método especial
        hashMap1.putAll(hashMap2);
        
        // Merge using stream API
        
        hashMap1.forEach( (k, v) -> { System.out.println("key: "+ k +" value:"+ v); });
        
        Long result = hashMap1.entrySet().stream().collect(Collectors.counting());
        
         
        
        System.out.println("calculado por stream hay : "+ result +" items"); 
        
        // hashMap1.values().stream().collect(Collectors.);
        
        // System.out.println("hashMap1 values prior forEach: "+ hashMap1);
 
		
        
        // sum = hashMap1.values().stream().reduce(0, (subtotal, value) -> subtotal + value);
        
        // reduce no modifica el contenido
        // System.out.println("hashMap1 values post forEach: "+ hashMap1);
        
        // System.out.println("Size: " + hashMap1.size());        
        // System.out.println("hashMap1 sumatoria: "+ sum);		
	}

}

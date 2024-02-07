package cl.challenges.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringGame {
	
		
	public static void main(String[] args) {
		
		
		String cad = new String("cadena original");		
		System.out.println("original: "+  cad);
		System.out.println(cad.hashCode());		
		System.out.println();
		
		Inmutable in = new Inmutable();
		//cad = 
				in.changeString(cad);
		
		
		System.out.println("post llamada: "+ cad);
		System.out.println(cad.hashCode());
		
		
		
		/*
		String[] lista = new String[]{"orange", "apple", "banana"};
		
		Arrays.sort(lista);
		
		for (String fruit : lista) {
			System.out.println(fruit);			
		}
		
		System.out.println();
		
		
		sortList();
		*/
		
	}
	
	
	private static void sortList() {
		
		List<String> arrayList = new ArrayList<>(List.of("Apple", "Banana", "Orange"));
		
		
		Collections.sort(arrayList, Collections.reverseOrder());		 

        // Print the elements in the ArrayList
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
		
	}

}

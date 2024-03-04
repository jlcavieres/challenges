package cl.challenges.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inmutable {
	
	
	public static void main(String[] args) {
		
		useInmutableObjectAsKey();
	
	}
		
	
	
	public static void useMutableObjectAsKey() {
		
		
		// Uso de StringBuilder, independiente de tener el mismo valor como contenido
		// al no ser el Wrappper de String que tiene el truco de usar un pool para los mismo valores
		// se le asigna un valor hash diferente en memoria
		
		String cad = new String("hola s");
		
		// cadsb.append("b");
				
		//System.out.println("cad: "+  cad);
		//System.out.println("cad hc: "+ cad.hashCode());		
		//System.out.println();
		
		StringBuilder cadsb = new StringBuilder("keyA");
		
		System.out.println("cadsb: "+  cadsb + " - "+ cadsb.hashCode());				
		System.out.println();
		
		
		HashMap<StringBuilder, String> hashMap = new HashMap<>();
        hashMap.put(cadsb, "hola");        
        
        // cambio el valor del objeto mutable
        cadsb.append("B");                
                
        System.out.println("cadsb (post append): "+  cadsb + " - "+ cadsb.hashCode()); // t: sigue apuntando al mismo espacio de memoria, pero tiene otro valor
        
        
        // Pregunto por el ID (no busca por texto, busca por referencia de memoria del objeto)
        System.out.println("busco por el ID con get: "+ hashMap.get(cadsb).toString());        
        System.out.println();
        
        System.out.println("cadsb: "+  cadsb + " - "+ cadsb.hashCode()); // sigue apuntando al mismo espacio de memoria, pero tiene otro valor        

        
        System.out.println("Size: " + hashMap.size());
        System.out.println();
        
        hashMap.forEach((key, value) -> System.out.println(key.hashCode() + " " + value));
		
	}	
	
	
	public static void useInmutableObjectAsKey() {
		
		// Uso de StringBuilder, independiente de tener el mismo valor como contenido
		// al no ser el Wrappper de String que tiene el truco de usar un pool para los mismo valores
		// se le asigna un valor hash diferente en memoria
		
		
		String cadsb = "keyA";
		
		System.out.println("cadsb: "+  cadsb + " - "+ cadsb.hashCode());				
		System.out.println();
		
		
		HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(cadsb, "hola");        
        
        // cambio el valor del objeto mutable
        cadsb = cadsb.concat("B");                 
                
        System.out.println("cadsb (post concat): "+  cadsb + " - "+ cadsb.hashCode()); // t: apounta a otros espacio de memoria y
        
        
        // Pregunto por el ID (no busca por texto, busca por referencia de memoria del objeto) en consecuencia en este punto cambio, no lo va a encontrar
        // provocará un null pointer exception (unchecked)
        System.out.println("busco por el ID con get: "+ hashMap.get(cadsb).toString());        
        System.out.println();
        
        System.out.println("cadsb: "+  cadsb + " - "+ cadsb.hashCode()); // tiene otro espacio de memoria y otro valor        

        
        System.out.println("Size: " + hashMap.size());
        System.out.println();
        
        hashMap.forEach((key, value) -> System.out.println(key.hashCode() + " " + value));
		
		
	}
	
	

}

package cl.challenges.collections;

import java.util.HashMap;

public class Inmutable {
	
	
	public static void main(String[] args) {
		
		
		// Uso de StringBuilder, independiente de tener el mismo valor como contenido
		// al no ser el Wrappper de String que tiene el truco de usar un pool para los mismo valores
		// se le asigna un valor hash diferente en memoria
		
		String cad = new String("hola");
		
		// cadsb.append("b");
				
		//System.out.println("cad: "+  cad);
		//System.out.println("cad hc: "+ cad.hashCode());		
		//System.out.println();
		
		StringBuilder cadsb = new StringBuilder("hola");
		
		System.out.println("cadsb: "+  cadsb);
		System.out.println("cadsb hc: "+ cadsb.hashCode());		
		System.out.println();
		
		
		HashMap<StringBuilder, String> hashMap = new HashMap<>();
        hashMap.put(cadsb, "valor 1");
        
        cadsb.append("2");
        
        System.out.println("cadsb: "+  cadsb);
        System.out.println("cadsb hc: "+ cadsb.hashCode());
        
        hashMap.put(cadsb, "valor 2");
        
        System.out.println("Size: " + hashMap.size());
        
        hashMap.forEach((key, value) -> System.out.println(key.hashCode() + " " + value));
		
	}
	
	
	
	
	void changeString(String cadena) {
		
		cadena = "modificado en otra clases, asignando mediante New String";
		
		//return new String("cadena original 2"); 
		
	}
	

}

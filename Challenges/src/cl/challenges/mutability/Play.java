package cl.challenges.mutability;

public class Play {
	
	
	public static void main(String[] args) {
		
		Cheese queso = new Cheese();
		queso.setLevelOfStinkiness(10);
		
		// Utilizando un String inmutable
		String cadena = new String("test");
		System.out.println("cadena original:"+ cadena +" ("+ cadena.hashCode() +")");
		
		System.out.println();
		System.out.println("LVL (pre): "+ queso.getLevelOfStinkiness());
		System.out.println("queso mem (pre)"+ queso.hashCode());		
		System.out.println();
		
				
		StringBuilder sb = new StringBuilder("abab");
		System.out.println("sb original:"+ sb +" ("+ sb.hashCode() +")");
				
		// Llamada al método
		increaseLevel(queso, cadena, sb);	
		
		
		System.out.println();
		System.out.println("LVL (post): "+ queso.getLevelOfStinkiness());
		System.out.println("queso mem (post)"+ queso.hashCode());
		System.out.println();
		
		System.out.println("cadena post llamada al método:"+ cadena +" ("+ cadena.hashCode() +")");		
		System.out.println("sb post llamada al método:"+ sb +" ("+ sb.hashCode() +")");
		
		
	}
	
	
	private static void increaseLevel(Cheese queso, String cadena, StringBuilder sb) {		
		queso.setLevelOfStinkiness(queso.getLevelOfStinkiness() + 1);
		
		System.out.println("cadena que entro como parámetro al métodos:"+ cadena +" ("+ cadena.hashCode() +")");
		System.out.println("sb que entro como parámetro al métodos:"+ sb +" ("+ sb.hashCode() +")");
		
		// Como es inmutable, no pone a disposición métodos por referencia (a diferencia de los Sets)
		cadena = cadena.toUpperCase();
		sb.append("ab");
		
		System.out.println("cadena que se re-asignó en el método:"+ cadena +" ("+ cadena.hashCode() +")");
		System.out.println("sb que cambió dentro del método:"+ sb +" ("+ sb.hashCode() +")");
	} 
	
	
	// GRAND CONCLUSION
	
	// Java primitives has a specific behavior, they aren't clasess, so enter to the function as a parameter with no reference, it make them behavior as an inmutable (chance doesn't persist)
	//  however it they are a memmer of a class and it changed, the behavior is like a mutable object (the change in the parent object persist) 
	
	// An immutable object can’t be updated, programs need to create a new object for every change of state
	
	// All primitive wrapper classess are inmutable, including the especial String and its custom using of pool of values
	
	// Mutable objects can be modified inside the method, and those changes will reflect 
	// outside the method since they are referencing the same object, the parameter than enters the method is the reference, not the object it self	

}

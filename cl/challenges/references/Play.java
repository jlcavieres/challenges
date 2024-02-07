package cl.challenges.references;

public class Play {
	
	
	public static void main(String[] args) {
		
		Cheese queso = new Cheese();
		queso.setLevelOfStinkiness(10);
		
		// Utilizando un String inmutable
		String cadena = new String("test");
		System.out.println("cadena original:"+ cadena +" ("+ cadena.hashCode() +")");
		
		System.out.println(queso.getLevelOfStinkiness());
		System.out.println("queso mem "+ queso.hashCode());
		
		System.out.println();
				
		// Llamada al método
		increaseLevel(queso, cadena);
		
		System.out.println(queso.getLevelOfStinkiness());
		System.out.println("queso mem "+ queso.hashCode());
		
		System.out.println("cadena post llamada al método:"+ cadena +" ("+ cadena.hashCode() +")");
		
	}
	
	
	private static void increaseLevel(Cheese queso, String cadena) {		
		queso.setLevelOfStinkiness(queso.getLevelOfStinkiness() + 1);
		
		System.out.println("cadena que entro como parámetro al métodos:"+ cadena +" ("+ cadena.hashCode() +")");
		
		// Como es inmutable, no pone a disposición métodos por referencia (a diferencia de los Sets)
		cadena = cadena.toUpperCase();
		
		System.out.println("cadena que entro como parámetro al métodos:"+ cadena +" ("+ cadena.hashCode() +")");
	} 
	
	
	// GRAND CONCLUSION
	
	// Mutable objects can be modified inside the method, and those changes will reflect 
	// outside the method since they are referencing the same object.
	
	
	
	

}

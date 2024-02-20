package cl.challenges.inheritance;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cat gato = new Cat();
		Dog perro = new Dog();
		Animal ani = new Animal();
		
		// No !! se puede asignar entre hijos con o sin cast
		// gato = perro;
		// gato = (Cat) perro;
		
		
		// No !! se puede asignar de padre a hijo sin cast
		// gato = ani;
		
		// Si se puede asignar SIN CAST un hijo al padre
		ani = gato;		 
		
		
		// Esto si está permitido
		// gato = (Cat) ani;
		
		//
		// CONCLUSIÓN
		//
		// El  padre se puede asignar al hijo solo casteando
		// El hijo se puede asignar al padre 
		
	

	}

}

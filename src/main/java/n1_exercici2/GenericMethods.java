package n1_exercici2;

public class GenericMethods {

	/*
	
	Crea una clase llamada Persona con los atributos nombre, apellido y edad. 
	Despu�s crea una clase llamada GenericMethods cuyo m�todo gen�rico 
	acepte tres argumentos de tipo gen�rico. 
	Este m�todo s�lo debe imprimir por pantalla los argumentos que ha recibido. 
	En el main() de la clase principal, llama al m�todo gen�rico con diferentes 
	tipos de par�metros.

	Ejemplo: un objeto de la clase Persona, un String y un tipo primitivo.

	De esta forma has comprobado que se le puede pasar cualquier tipo de par�metro
	 y en cualquier orden.
	
	*/
	
	public static void main (String[] args) {
		
		GenericMethods gm = new GenericMethods();
		gm.generico(new Persona(), "Messi", 35);
		gm.generico(35, "Messi", new Persona("Pulga"));
	}
	
	public <T,U,K> void generico  (T t, U u, K k) {
		
		System.out.println("T " + t + " U " + u + " K " + k );
		
	}	
	
	
}

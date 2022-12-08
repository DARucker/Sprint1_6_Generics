package n1_exercici2;

public class GenericMethods {

	/*
	
	Crea una clase llamada Persona con los atributos nombre, apellido y edad. 
	Después crea una clase llamada GenericMethods cuyo método genérico 
	acepte tres argumentos de tipo genérico. 
	Este método sólo debe imprimir por pantalla los argumentos que ha recibido. 
	En el main() de la clase principal, llama al método genérico con diferentes 
	tipos de parámetros.

	Ejemplo: un objeto de la clase Persona, un String y un tipo primitivo.

	De esta forma has comprobado que se le puede pasar cualquier tipo de parámetro
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

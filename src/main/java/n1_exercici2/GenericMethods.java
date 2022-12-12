package n1_exercici2;

public class GenericMethods {

	public static void main (String[] args) {
		
		GenericMethods gm = new GenericMethods();
		gm.generico(new Persona(), "Messi", 35);
		gm.generico(35, "Messi", new Persona("Pulga"));
	}
	
	public <T,U,K> void generico  (T t, U u, K k) {
		
		System.out.println("T " + t + " U " + u + " K " + k );
		
	}		
}

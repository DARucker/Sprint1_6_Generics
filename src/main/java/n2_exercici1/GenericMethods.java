package n2_exercici1;

public class GenericMethods {
	
	public static void main (String[] args) {
		
		GenericMethods gm = new GenericMethods();
		gm.generico(new Personan2(), "Messi", 35);
		gm.generico("Messi", new Personan2("Pulga"), 135);
	}
	
	public <T,U> void generico(T t, U u, int v) {
		
		System.out.println("T: " + t + " U: " + u + " EDAD: " + v );
		
	}	
	
	
}

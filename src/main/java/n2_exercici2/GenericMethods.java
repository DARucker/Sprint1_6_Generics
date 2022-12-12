package n2_exercici2;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

	public static void main (String[] args) {
		
		GenericMethods gm = new GenericMethods();
		gm.llenarArray();
		gm.llenarOtroArray();
	}
	
	public void llenarArray() {	
		GenericMethods gm1 = new GenericMethods();
		
		List<Persona_2_2> listaT = new ArrayList<>();
		listaT.add(new Persona_2_2("Leo", "Messi", 35));		
		listaT.add(new Persona_2_2("Ariel", "Ortega", 40));
		listaT.add(new Persona_2_2("Maradona"));
		gm1.generico(100, listaT);
	}
	
	public void llenarOtroArray() {	
		GenericMethods gm1 = new GenericMethods();
		
		List<String> listaT = new ArrayList<>();
		listaT.add("Barcelona");		
		listaT.add("Buenos Aires");
		listaT.add("New York");
		gm1.generico(28, listaT);
	}
	
	public <T> void generico(int v, List<T> ListaT) {
		
		for (T t : ListaT) {
			System.out.println(t.toString() + " " + v);
		}
				
	}	
	
	
}

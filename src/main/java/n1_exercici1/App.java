package n1_exercici1;

public class App <T> {
		
	private T t1, t2, t3;
	NoGenericsMethods<T> n = new NoGenericsMethods<>();
	
	public  void  inicializer () {


		NoGenericsMethods<T> ordenado = new NoGenericsMethods<>(t1,t2,t3);
		NoGenericsMethods<T> desordenado = new NoGenericsMethods<>(t3,t1,t2);
		NoGenericsMethods<T> constructorPorDefecto = new NoGenericsMethods<>();
		
		// Integer
		NoGenericsMethods<Integer> n1 = new NoGenericsMethods<>(1, 4, 2);		
		NoGenericsMethods<Integer> n5 = new NoGenericsMethods<>(1,2,3);

		// String
		NoGenericsMethods<String> n2 = new NoGenericsMethods<>("Hola", "Mundo", "Mundial");
	
		// Otros constructores para practicar
		n.inicializer(3, "Hola", 5);
		n.inicializer2("Hola", 10, "Messi");
	
	}
	

}

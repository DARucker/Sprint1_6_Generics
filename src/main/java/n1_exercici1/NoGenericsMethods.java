package n1_exercici1;

public  class  NoGenericsMethods <T> {

	/*
	Crea una clase llamada NoGenericMethods que almacene tres objetos 
	del mismo tipo, junto con los métodos para almacenar y extraer estos 
	objetos y un constructor para inicializar los tres. Comprueba que los 
	argumentos pueden ponerse en cualquier posición en la llamada al 
	constructor.
	<T, T, T>
*/	
	
	private T t;
	private T t1;
	private T t2;

	public NoGenericsMethods(T t, T t1, T t2) {
		
		this.t = t;
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public NoGenericsMethods() {
		// TODO Auto-generated constructor stub
	}

	public void inicializer (int i, String string, int j) {
		
		System.out.println(i + " " + string + " " + j);
	}
	
	public void inicializer2 (String string, int j, String string2) {
		
		System.out.println(string + " " + j  + " " +  string2);
	}


	public T getT() {
		return t;
	}




	public void setT(T t) {
		this.t = t;
	}




	public T getT1() {
		return t1;
	}




	public void setT1(T t1) {
		this.t1 = t1;
	}




	public T getT2() {
		return t2;
	}




	public void setT2(T t2) {
		this.t2 = t2;
	}
	
}
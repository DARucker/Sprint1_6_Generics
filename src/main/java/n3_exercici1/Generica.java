package n3_exercici1;

public class Generica <T>  {

	private T t;
	
	public Generica(T t) {
		this.t = t;
	}

	public Generica() {
		// TODO Auto-generated constructor stub
	}
	
	public <T extends Telefono> void metodoGenerico1(T t) {
		t.llamar();
		// t.hacerFotos(); No es posible 
	}
	
	public <T extends Smartphone> void metodoGenerico2(T t) {
		
		t.hacerFotos();
		t.llamar();
	}
	
	
}

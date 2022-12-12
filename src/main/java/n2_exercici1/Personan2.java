package n2_exercici1;

public class Personan2 {

	private String nombre;
	private String apellido;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Personan2(String nombre) {
			this.nombre = nombre;
	}
	
	public Personan2() {
	}

	@Override
	public String toString() {
		return "Personan2 [nombre=" + nombre + "]";
	}	
}

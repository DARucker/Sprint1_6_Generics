package n2_exercici2;

public class Persona_2_2 {

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
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona_2_2(String nombre, String apellido, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Persona_2_2(String nombre)	{		
		this.nombre = nombre;	
		}
	@Override
	public String toString() {
		return "Persona_2_2 [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}

package ejercicio_01;


public class Persona {
	private int dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	Persona(int dni, String nombre, String apellido, Domicilio domicilio) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setDomicilio(domicilio);
	}

	@Override
	public String toString() {
		return this.nombre + " " + this.apellido + ", DNI: " + this.dni + ", vive en: " + this.domicilio.toString();
	}
	
	private void setDni(int dni) {
		this.dni = dni;
	}
	
	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDomicilio() {
		return domicilio.toString();
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
}

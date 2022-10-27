package ejercicio_03;

public class Propiedad {
	private String domicilio;
	private int precio;
	private TIPO_PROPIEDAD tipo;
	
	Propiedad(String domicilio, int precio, TIPO_PROPIEDAD tipo) {
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	public boolean esTipo(TIPO_PROPIEDAD tipo) {
		return this.tipo.equals(tipo);
	}
	
	public boolean esDomicilio(String domicilio) {
		return this.domicilio.equals(domicilio);
	}
	
	@Override
	public String toString() {
		return "Queda en " + this.domicilio + " y vale $" + this.precio;
	}
	
	public String toStringCompleto() {
		return this.toString() + " y es de tipo " + this.tipo.getNombre();
	}
}

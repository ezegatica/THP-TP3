package ejercicio_01;

public class Domicilio {
	private String calle;
	private int numero;
	private String barrio;

	Domicilio(String calle, int numero, String barrio) {
		this.calle = calle;
		this.numero = numero;
		this.barrio = barrio;
	}

	@Override
	public String toString() {		
		return this.calle + " " + this.numero + ", " + this.barrio;
	}

	public String getCalle() {
		return this.calle;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getBarrio() {
		return this.barrio;
	}
}

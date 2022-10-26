package ejercicio_02;

public class Empleado {
	private String nombre;
	private Oficina oficina;

	Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	
	public boolean tieneOficina() {
		return oficina != null;
	}
	
	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}
	
	@Override
	public String toString() {
		return "   - " + this.nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}

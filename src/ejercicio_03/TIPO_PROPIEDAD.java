package ejercicio_03;

public enum TIPO_PROPIEDAD {
	DEPARTAMENTO("Departamento"),
	CASA("Casa"),
	PH("PH");
	
	private String nombre;
	
	private TIPO_PROPIEDAD(String label) {
		this.nombre = label;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}

package ejercicio_03;

import java.util.ArrayList;

public class Barrio {
	private String nombre;
	private ArrayList<Propiedad> propiedades;
	
	Barrio(String nombre) {
		this.nombre = nombre;
		ArrayList<Propiedad> propiedades = new ArrayList<>();
		this.propiedades = propiedades;
	}
	
	public void mostrarPropiedades(TIPO_PROPIEDAD tipo) {
		for (Propiedad p: propiedades) {
			if (p.esTipo(tipo)) {
				System.out.println(p.toString());				
			}
		}
	}
	
	public void mostrarPropiedades() {
		for (Propiedad p: propiedades) {
			System.out.println(p.toStringCompleto());
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getCantidadPropiedades() {
		return this.propiedades.size();
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public Propiedad removerPropiedad(String domicilio) {
		Propiedad propiedadEncontrada = buscarPropiedad(domicilio);
		this.propiedades.remove(propiedadEncontrada);
		return propiedadEncontrada;
	}
	
	public Propiedad buscarPropiedad(String domicilio) {
		Propiedad propiedadEncontrada = null;
		boolean encontrado = false;
		int i = 0;
		while (i < propiedades.size() && !encontrado) {
			Propiedad p = this.propiedades.get(i);
			if (p.esDomicilio(domicilio)) {
				propiedadEncontrada = p;
				encontrado = true;
			}
			i++;
		}
		return propiedadEncontrada;
	}
}

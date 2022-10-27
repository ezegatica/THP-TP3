package ejercicio_03;

import java.util.ArrayList;

public class Inmobiliaria {
	private ArrayList<Barrio> barrios;
	private String nombre;

	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
		ArrayList<Barrio> barrios = new ArrayList<>();
		this.barrios = barrios;
	}

	public void mostrarPropiedades() {
		for (Barrio b: barrios) {
			b.mostrarPropiedades();
		}
	}

	public void mostrarPropiedades(TIPO_PROPIEDAD tipo) {
		for (Barrio b: barrios) {
			b.mostrarPropiedades(tipo);
		}
	}

	private ArrayList<Barrio> obtenerBarrioMaxProp() {
		ArrayList<Barrio> barriosMax = new ArrayList<>();
		int cantidadPropiedadesMaxima = 0;

		for (Barrio b: barrios) {
			int cantidad = b.getCantidadPropiedades();

			if (cantidad >= cantidadPropiedadesMaxima) {
				if (cantidad > cantidadPropiedadesMaxima) {
					barriosMax.clear();
					cantidadPropiedadesMaxima = cantidad;					
				}
				barriosMax.add(b);
			}
		}
		return barriosMax;
	}

	public void mostrarBarrioMaxProp() {
		ArrayList<Barrio> barriosMax = obtenerBarrioMaxProp();
		System.out.println("El/Los barrios de " + this.nombre +  " con mayor cantidad de propiedades: ");
		for (Barrio b: barriosMax) {
			System.out.println(" - " + b.getNombre() + " (" + b.getCantidadPropiedades() + ")");
		}

	}

	private Barrio buscarBarrioPorDomicilio(String domicilio) {
		Barrio barrioEncontrado = null;
		boolean encontrado = false;
		int i = 0;
		while (i < barrios.size() && !encontrado) {
			Barrio b = this.barrios.get(i);
			Propiedad propiedadEncontrada = b.buscarPropiedad(domicilio);
			if (propiedadEncontrada != null) {
				encontrado = true;
				barrioEncontrado = b;
			}
			i++;
		}
		return barrioEncontrado;
	}

	public void cambiarPropiedadDeBarrio(String domicilio, Barrio barrioNuevo) {
		Barrio barrioViejo = this.buscarBarrioPorDomicilio(domicilio);
		if (barrioViejo != null) { // Ya que puede no haber encontrado el barrio y no devolver nada
			Propiedad p = barrioViejo.removerPropiedad(domicilio);
			if (p != null) { // Ya que puede no haber encontrado el domicilio y no devolver nada
				barrioNuevo.agregarPropiedad(p);
			}
		}
	}
	
	public void borrarPropiedad(String domicilio) {
		Barrio barrio = this.buscarBarrioPorDomicilio(domicilio);
		if (barrio != null) { // Ya que puede no haber encontrado el barrio y no devolver nada
			barrio.removerPropiedad(domicilio);
		}
	}
	
	public void agregarBarrio(Barrio barrio) {
		this.barrios.add(barrio);
	}
	
	public String getNombre() {
		return this.nombre;
	}
}

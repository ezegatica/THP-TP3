package ejercicio_02;

import java.util.ArrayList;

public class Compania {
	private String nombre;
	private ArrayList<Area> areas;

	Compania(String nombre) {
		ArrayList<Area> areas = new ArrayList<>();
		this.areas = areas;
		this.nombre = nombre;
	}
	
	public void agregarArea(Area area) {
		this.areas.add(area);
	}
	
	public void getEmpleados() {
		System.out.println("La compañía " + this.nombre + " tiene las siguientes areas: ");
		for (Area a: areas) {
			a.getOficinas();
		}
	}
}

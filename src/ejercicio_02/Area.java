package ejercicio_02;

import java.util.ArrayList;

public class Area {
	private String nombre;
	private ArrayList<Oficina> oficinas;
	
	Area(String nombre) {
		ArrayList<Oficina> oficinas = new ArrayList<>();
		this.oficinas = oficinas;
		this.nombre = nombre;
	}
	
	public void agregarOficina(Oficina oficina) {
		if (!oficina.tieneArea()) {
			oficina.setArea(this);
			this.oficinas.add(oficina);				
		} else {
			System.out.println("La oficina " + oficina.toString() + " ya tiene area asignada");
		}
	}	
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	public void listarOficinas() {
		System.out.println(" - " + this.nombre + ", con las oficinas: ");
		for (Oficina o: oficinas) {
			o.listarEmpleados();
		}
	}
}

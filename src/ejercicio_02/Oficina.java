package ejercicio_02;

import java.util.ArrayList;

public class Oficina {
	private String nombre;
	private Area area;
	private ArrayList<Empleado> empleados;

	Oficina(String nombre) {
		ArrayList<Empleado> empleados = new ArrayList<>();
		this.empleados = empleados;
		this.nombre = nombre;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		if (!empleado.tieneOficina()) {
			empleado.setOficina(this);
			this.empleados.add(empleado);
		} else {
			System.out.println("El empleado " + empleado.getNombre() + " ya tiene oficina");
		}
	}
	
	public boolean tieneArea() {
		return this.area != null;
	}
	
	public void setArea(Area area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	public void getEmpleados() {
		System.out.println("  - " + this.nombre + ", y tiene los siguientes empleados:");
		for (Empleado e: empleados) {
			System.out.println(e.toString());
		}
	}
}

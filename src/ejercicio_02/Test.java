package ejercicio_02;

public class Test {

	public static void main(String[] args) {
		// Declaración de variables
		Compania c1 = new Compania("Google");
		Area a1 = new Area("IT");
		Area a2 = new Area("Administración");
		Oficina o1 = new Oficina("Palermo");
		Oficina o2 = new Oficina("Belgrano");
		Oficina o3 = new Oficina("Puerto Madero");
		Empleado e1 = new Empleado("Juan");
		Empleado e2 = new Empleado("Pepe");
		Empleado e3 = new Empleado("Susana");
		Empleado e4 = new Empleado("Maria");
		Empleado e5 = new Empleado("Laura");
		Empleado e6 = new Empleado("Enzo");

		// Linkeo de entidades
		c1.agregarArea(a1);
		c1.agregarArea(a2);
		
		a1.agregarOficina(o1);
		a1.agregarOficina(o2);
		a2.agregarOficina(o3);
		a1.agregarOficina(o3); // <-- La oficina Puerto Madero ya tiene area
		
		o1.agregarEmpleado(e1);
		o1.agregarEmpleado(e2);
		o2.agregarEmpleado(e1); // <-- El empleado Juan ya tiene oficina
		o2.agregarEmpleado(e3);
		o2.agregarEmpleado(e4);
		o3.agregarEmpleado(e5);
		o3.agregarEmpleado(e6);
		
		System.out.println("-------------"); // Separador

		// Out principal
		c1.getEmpleados();

	}

}

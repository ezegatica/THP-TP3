package ejercicio_01;

public class Test {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Domicilio domicilio1 = new Domicilio("Av. Cabildo", 2135, "Belgrano");
		Domicilio domicilio2 = new Domicilio("Av. Corrientes", 1223, "Caballito");

		agenda.agregarPersona(1, "Pepe", "Sanchez", domicilio1);
		agenda.agregarPersona(2, "Juan", "Perez", domicilio1);
		agenda.agregarPersona(3, "Lucia", "Gomez", domicilio1);
		agenda.agregarPersona(4, "Maria", "Torres", domicilio1);
		
		System.out.println(agenda.removerPersona(5)); // null
		
		System.out.println(agenda.removerPersona(4)); // Maria Torres, DNI: 10000004, vive en: Av. Cabildo 2135, Belgrano

		System.out.println(agenda.modificarDomicilio(4, domicilio2)); // false

		System.out.println(agenda.modificarDomicilio(3, domicilio2)); // true
		
		agenda.listarPersonas(); // Todas las personas, menos la que tiene (dni: 4)
				
		agenda.eliminarTodosElementosAMano();
		
		agenda.listarPersonas(); // <nada>
	}

}

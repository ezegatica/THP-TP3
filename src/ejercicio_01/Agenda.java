package ejercicio_01;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> personas;
	Agenda(){
		ArrayList<Persona> personas = new ArrayList<>();
		this.personas = personas;
	}
	
	private Persona buscarPersona(int dni) {
		for (Persona p: personas) {
			if (p.getDni() == dni) {
				return p;
			}
		}
		return null;
	}
	
	public boolean agregarPersona(int dni, String nombre, String apellido, Domicilio domicilio) {
		if (this.buscarPersona(dni) == null) {
			Persona nuevaPersona = new Persona(dni, nombre, apellido, domicilio);
			this.personas.add(nuevaPersona);
			return true;
		}
		return false;
	}
	
	public Persona removerPersona(int dni) {
		Persona persona = this.buscarPersona(dni);
		if (persona != null) {
			this.personas.remove(persona);
			return persona;
		}
		return null;
	}
	
	public boolean modificarDomicilio(int dni, Domicilio domicilio) {
		Persona persona = this.buscarPersona(dni);
		if (persona != null) {
			persona.setDomicilio(domicilio);
			return true;
		}
		return false;
	}
	
	public void listarPersonas() {
		for (Persona p: personas) {
			System.out.println(p.toString());
		}
	}
	
	public Persona devolverUltimo() {
		if (!personas.isEmpty()) {
			return personas.get(personas.size() - 1);
		} 
		return null;
	}
	
	public void eliminarTodosElementosAMano() {
		  for(int i = personas.size() - 1; i >= 0; i--) {			// FUNCIONA IGUAL: this.removerPersona(this.devolverUltimo().getDni());
			this.personas.remove(i);
		}
	}
}

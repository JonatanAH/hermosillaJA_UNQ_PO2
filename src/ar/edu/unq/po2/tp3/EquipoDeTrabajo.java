package ar.edu.unq.po2.tp3;

import java.util.List;
import java.util.ArrayList;

public class EquipoDeTrabajo {

	private String nombre;
	private List<Persona> personal;

	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.personal = new ArrayList<Persona>();
	}

	public void addPersona(Persona persona) {
		this.personal.add(persona);
	}

	public String getNombre() {
		return this.nombre;
	}

	public int promedioDeEdad() {
		int sumaEdad = 0;
		int cantidadPersonas = this.personal.size();
		for(Persona persona: this.personal) {
			sumaEdad += persona.getEdad();
		}
		return sumaEdad / cantidadPersonas;
	}
	

}

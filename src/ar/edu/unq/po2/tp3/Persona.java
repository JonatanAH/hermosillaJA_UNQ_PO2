package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private LocalDate fechaDeNacimineto;

	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimineto = fechaDeNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNacimineto;
	}

	public int getEdad() {
		LocalDate actualidad = LocalDate.now();

        Period periodo = Period.between(this.getFechaDeNacimiento(), actualidad);
        return periodo.getYears();
	}

	public boolean esMayorQue(Persona persona) {
		return this.getEdad() > persona.getEdad();
	}

}

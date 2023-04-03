package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	// El formato de fecha que se usara sera "dd/MM/yyyy" ejemplo "28/01/1989".
	protected EstadoCivil estadoCivil;
	// El formato de fecha que se usara sera "dd/MM/yyyy" ejemplo "28/01/1989".
	private String fechaNacimiento;
	protected float sueldoBasico;
	
	Empleado(String nombre, String direccion, EstadoCivil estadoCivil, String fechaNacimiento, float sueldoBasico){
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	abstract public float calcularSueldoBruto();
	abstract float calcularRetenciones();
	
	public int calcularMiEdad() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nacimiento = LocalDate.parse(this.fechaNacimiento, formato);
        LocalDate actualidad = LocalDate.now();

        Period periodo = Period.between(nacimiento, actualidad);
        return periodo.getYears();
	}

	protected float calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}
}
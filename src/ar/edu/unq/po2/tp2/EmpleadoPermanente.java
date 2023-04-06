package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {

	private int cantidadDeHijos;
	private int antiguedad;
	
	EmpleadoPermanente(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNacimiento, float sueldoBasico, int cantidadDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}

	@Override
	public float calcularSueldoBruto() {
		float asignacionPorHijo = 150 * this.cantidadDeHijos;
		float asignacionPorConyugue = this.estadoCivil.asignacion();
		float antiguedad = 50 * this.antiguedad;
		return this.sueldoBasico + asignacionPorHijo + asignacionPorConyugue + antiguedad;
	}

	@Override
	public float calcularRetenciones() {
		float obraSocial = (this.sueldoBasico * 10) / 100;
		float porHijo = 20 * this.cantidadDeHijos;
		float aporteJubilatorio = (this.sueldoBasico * 15) / 100;
		return obraSocial + porHijo + aporteJubilatorio;
	}

}
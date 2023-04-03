package ar.edu.unq.po2.tp2;

import java.util.Date;

public class Registro {

	private String nombre;
	private String direccion;
	private String fechaDeEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	private String desgloseDeConceptos;

	public Registro(String nombreEmpleado, String direccion, float sueldoBruto, float sueldoNeto, String desgloseDeConceptos) {
		this.nombre = nombreEmpleado;
		this.direccion = direccion;
		this.fechaDeEmision = new Date().toString();
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.desgloseDeConceptos = desgloseDeConceptos;
	}
}

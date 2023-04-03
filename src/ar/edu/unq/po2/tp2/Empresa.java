package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private int cuit;
	private List<Empleado> personal;
	private List<Registro> documentacion = new ArrayList<Registro>();
	
	Empresa(String nombre, int cuit, List<Empleado> personal){
		this.nombre = nombre;
		this.cuit = cuit;
		this.personal = personal;
	}

	public float totalDeSueldosBrutos() {
		int total = 0;
		for(Empleado empleado :personal) {
			total += empleado.calcularSueldoBruto();
		}		
		return total;
	}

	public float totalDeRetenciones() {
		float total = 0;
		for (Empleado empleado : this.personal) {
			total += empleado.calcularRetenciones();
		}
		return total;
	}
	
	public float totalDeSueldosNetos() {
		return this.totalDeSueldosBrutos() - this.totalDeRetenciones();
	}

	public void liquidacionDeSueldos() {
		Registro nuevo; 
		for (Empleado empleado : this.personal) {
			nuevo = new Registro(empleado.getNombre(), empleado.getDireccion(), empleado.calcularSueldoBruto(), empleado.calcularSueldoNeto(), "Desglose que no se que es");
			this.documentacion.add(nuevo);
		}
	}	
}

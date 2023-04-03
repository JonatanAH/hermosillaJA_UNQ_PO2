package ar.edu.unq.po2.tp2;

public class EmpleadoContratado extends Empleado {
	private int numeroDeContrato;
	private String medioDePago;
	
	EmpleadoContratado(String nombre, String direccion, EstadoCivil estadoCivil, String fechaNacimiento, float sueldoBasico, int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public float calcularSueldoBruto() {
		return this.sueldoBasico;
	}

	@Override
	public float calcularRetenciones() {
		return 50;
	}

}

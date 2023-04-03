package ar.edu.unq.po2.tp2;

public class EmpleadoTemporal extends Empleado {

	private String fechaFinDesignacion;
	private int horasExtras;
	
	EmpleadoTemporal(String nombre, String direccion, EstadoCivil estadoCivil, String fechaNacimiento, float sueldoBasico, String fechaFinDesignacion, int horasExtras) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.horasExtras = horasExtras;
	}

	@Override
	public float calcularSueldoBruto() {
		return this.sueldoBasico + 40 * this.horasExtras;
	}

	@Override
	public float calcularRetenciones() {
		float obraSocial = (this.sueldoBasico * 10) / 100;
		float mayorDeCincuenta = 0;
		if(this.calcularMiEdad() > 50) {
			mayorDeCincuenta += 25;
		}
		float aporteJubilatorio = (this.sueldoBasico * 10) / 100;
		float porHorasExtras = 5 * this.horasExtras;
		return obraSocial + mayorDeCincuenta + aporteJubilatorio + porHorasExtras;
	}

}

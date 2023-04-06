package ar.edu.unq.po2.tp3;

public class Cuadrado {
	private Rectangulo rectangulo;
	
	public Cuadrado(int x, int y, int tamaño) {
		this.rectangulo = new Rectangulo(x, y, tamaño, tamaño);
	}

	public int getArea() {
		return this.rectangulo.getArea();
	}

	public int getPerimetro() {
		return this.rectangulo.getPerimetro();
	}

}

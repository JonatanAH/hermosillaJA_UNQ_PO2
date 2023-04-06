package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Punto puntoIA;
	private Punto puntoDA;
	private Punto puntoIB;
	private Punto puntoDB;

	public Rectangulo(int x, int y, int ancho, int alto) {
		this.puntoIA = new Punto(x, y);
		this.puntoDA = new Punto(x + ancho, y);
		this.puntoIB = new Punto(x, y + alto);
		this.puntoDB = new Punto(x + ancho, y + alto);
	}

	public int getArea() {
		return (this.puntoDB.getX() - this.puntoIA.getX()) * (this.puntoDB.getY() - this.puntoIA.getY());
	}

	public int getPerimetro() {
		return (this.puntoDB.getX() - this.puntoIA.getX()) * 2 + (this.puntoDB.getY() - this.puntoIA.getY()) * 2;
	}
	
	private int ancho() {
		return (this.puntoDB.getX() - this.puntoIA.getX());
	}
	
	private int alto() {
		return (this.puntoDB.getY() - this.puntoIA.getY());
	}

	public String getEje() {
		if(this.alto() > this.ancho()) {
			return "Vertical";
		}
		return "Horizontal";
	}
	
		
}

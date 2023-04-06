package ar.edu.unq.po2.tp3;

public class Punto {
	int x = 0;
	int y = 0;
	
	Punto(int x, int y){
		this.x = x;
		this.y = y;
	}

	public Punto() {
		//Constructor por defecto
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public Punto sumarPuntos(Punto otroPunto) {
		return new Punto(this.getX() + otroPunto.getX(), this.getY() + otroPunto.getY());
	}
	
	
}

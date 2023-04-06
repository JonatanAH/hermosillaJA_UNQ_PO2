package ar.edu.unq.po2.tp3;

public class Multiplos {

	public int masCercanoaMil(int x, int y){
		int numeroMasCercano = this.buscarCon(x);
		if(x > y) {
			numeroMasCercano = this.buscarCon(y);
		}
		if(this.esMultiplo(x, y, numeroMasCercano)) {
			return numeroMasCercano;
		}
		return -1;
	}

	private boolean esMultiplo(int x, int y, int numeroMasCercano) {
		return numeroMasCercano % x + numeroMasCercano % y == 0;
	}

	private int buscarCon(int x) {
		int xPrueba = 0;
		while(xPrueba <= 1000) {
			xPrueba += x;
		}
		xPrueba -= x;
		return xPrueba;
	}
}

package ar.edu.unq.po2.tp3;

import java.util.List;

public class DesarmandoNumeros {

	public Integer maxPar(List<Integer> arregloDeEnteros) {
		Integer cantidadDePares = 0;
		Integer numeroMayorEnPares = 0;
		for(Integer numero: arregloDeEnteros) {
			if(maxParUno(numero) > cantidadDePares) {
				numeroMayorEnPares = numero;
				cantidadDePares = maxParUno(numero);
			}
		}
		return numeroMayorEnPares;
	}

	private Integer maxParUno(Integer numero) {
		Integer numeroUsado = numero;
		Integer contadorDePares = 0;
		while(numeroUsado > 0) {
			if(numeroUsado % 2 == 0) {
				contadorDePares++;
			}
			numeroUsado = numeroUsado / 10;
		}
		return contadorDePares;
	}	

}

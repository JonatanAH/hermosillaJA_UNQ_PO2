package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {

	public Integer sumarTodo(List<Integer> listaASumar) {
		Integer resultado = 0;
		for(Integer numero: listaASumar) {
			resultado += numero;
		}
		return resultado;
	}
	
	public Integer restarTodo(List<Integer> listaASumar) {
		Integer resultado = 0;
		for(Integer numero: listaASumar) {
			resultado -= numero;
		}
		return resultado;
	}
	
	public Integer multiplicarTodo(List<Integer> listaASumar) {
		Integer resultado = 1;
		for(Integer numero: listaASumar) {
			resultado *= numero;
		}
		return resultado;
	}	
}

package main;

import facade.GestorHipotecas;

public class Main {

	public static void main(String[] args) {
		//el patron facade nos indica que de una gran multitud
		//de subsistemas, para una funcionalidad concreta
		//como es en este caso concederHipoteca, no tengamos
		//que buscar, entender y usar multiples subsistemas
		//sino simplemente un elemento facade, en este caso 
		// GestorHipotecas, que ya sabe cuales usar. 
		int idCliente = 44;
		GestorHipotecas gh = new GestorHipotecas();
		boolean resultado = 
				gh.concederHipoteca(50000, idCliente);
		System.out.println("resultado de "
				+ "conceder hipoteca: " + resultado);		
	}

}

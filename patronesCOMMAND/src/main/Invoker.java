package main;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	Calculadora calculadora = new Calculadora();
	List<Comando> comandos = 
			new ArrayList<Comando>();
	int comandoActual = 0;
	
	public void ejecuta(char operador, int operando) {
		Comando comando = 
				new ComandoCalculadora(
						operador, operando, calculadora);
		comando.ejecutar();
		comandos.add(comando);
		comandoActual++;		
	}
	
	public void deshacer() {
//		int comandoAdeshacer = comandoActual - 1;
//		comandoActual--;
		//las dos lineas anteriores se pueden resumir en la 
		//siguiente:
		int comandoAdeshacer = --comandoActual;
		//la linea anterior decrementa comandoActual en 1 
		//y el resultado se le asigna a comandoAdeshacer
		Comando comando = comandos.get(comandoAdeshacer);
		comando.deshacer();
	}

}

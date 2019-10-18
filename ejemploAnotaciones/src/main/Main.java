package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//las anotaciones no hacen nada, 
		//no tienen codigo por dentro
		//se usan para marcar clases, metodos etc.
		
		//y ahora otro codigo escanea que cosas tienen que 
		//anotaciones, y ejecuta lo que haya que ejecutar 
		//en consecuencia.
		
		Apuesta a = new Apuesta();
		Apuesta a2 = new Apuesta();
		Juego j = new Juego();
		List<Object> objetos = new ArrayList<Object>();
		objetos.add(a);
		objetos.add(a2);
		objetos.add(j);
		procesarAnotaciones(objetos);		
	}

	//una anotacion vale simple y unicamente para marcar algo 
	//una anotacion de por si no tiene codigo a ejecutar
	//otro codigo ejecutara lo que quiera ejecutar al detectar
	//si algo fue anotado con una anotacion.
	
	private static void procesarAnotaciones(List<Object> objetos) {
		for (Object object : objetos) {
			Servicio anotacionServicio = 
				object.getClass().getAnnotation(Servicio.class);
			if(anotacionServicio!=null) {
				System.out.println("detectada anotacion @Servicio");
				System.out.println("en el objeto");
				
			}
		}
		
	}

}

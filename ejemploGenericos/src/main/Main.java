package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Juguete> juguetes = 
				new ArrayList<Juguete>();
		Listado<Juguete> listado = 
				new Listado<Juguete>(new Juguete(),"hola");
		listado.mostrarDatosDeLaClase();
	}

}

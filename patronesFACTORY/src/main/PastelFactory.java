package main;

public class PastelFactory {
	
	public Pastel crearPastel(String nombre) {
		//esta seria una parte complicada, donde habria
		//que preparar diferentes cosas antes de poder
		//tener un objeto de la clase Pastel
		Pastel p = new Pastel(nombre);
		return p;
	}
	
}

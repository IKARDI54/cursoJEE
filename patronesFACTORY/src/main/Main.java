package main;

public class Main {

	public static void main(String[] args) {
		PastelFactory pf = new PastelFactory();
		Pastel croissant = pf.crearPastel("croissant");
		System.out.println("tengo el objeto: " + 
				croissant.toString());
	}

}

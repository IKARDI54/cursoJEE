package main;

public class Main {

	public static void main(String[] args) {
		//en java los tipos basicos de dato se tratan de forma
		//distinta a los objetos
		int x = 10;
		Usuario u = new Usuario("Juan","juan@gmail.com");
		sumaDos(x);
		cambiarNombre(u, "Javier");
		System.out.println("x: " + x);
		System.out.println("nombre de u: " + u.getNombre());
		//al dar un tipo basico de dato a un metodo
		//java no da el dato original, por eso da igual que le 
		//sumos dos o lo que sea. El dato original no se modifica.
		//Sin embargo como se puede ver en este ejemplo, con 
		//los objetos pasa exactamente lo contrario.
	}
	
	private static void sumaDos(int x) {
		x = x + 2;
	}
	
	private static void cambiarNombre(Usuario u, String nombre) {
		u.setNombre(nombre);
	}
	

}

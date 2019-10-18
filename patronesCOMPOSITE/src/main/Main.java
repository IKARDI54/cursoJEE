package main;

public class Main {

	public static void main(String[] args) {
		
		Rama ramaPrincipal = new Rama("pedido");
		Rama identificarUsuario = 
				new Rama("identificar usuario");
		Rama procesarCompra = 
				new Rama("procesar compra");
		
		identificarUsuario.add(new Hoja(
				"mostrar formulario identificacion"));
		identificarUsuario.add(new Hoja(
				"comprobar datos insertados"));
		ramaPrincipal.add(identificarUsuario);
		ramaPrincipal.add(procesarCompra);
		ramaPrincipal.mostrar();
		
	}

}

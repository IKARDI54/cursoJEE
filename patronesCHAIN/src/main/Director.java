package main;

public class Director extends Handler{

	@Override
	public void procesarPeticion(Compra c) {
		if( c.getCantidad() > 10000 ) {
			sucesor.procesarPeticion(c);
		}else{
			System.out.println("director atiende la compra: "
					+ c.getProposito());
		}
	}
	
}

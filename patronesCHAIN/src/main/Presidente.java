package main;

public class Presidente extends Handler{

	@Override
	public void procesarPeticion(Compra c) {
		System.out.println("presidente " + 
				"atiende la compra: " + 
				c.getProposito());		
	}

}

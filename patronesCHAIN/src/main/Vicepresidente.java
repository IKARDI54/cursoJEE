package main;

public class Vicepresidente extends Handler {

	@Override
	public void procesarPeticion(Compra c) {
		if (c.getCantidad() > 100_000) {
			sucesor.procesarPeticion(c);
		}else {
			System.out.println("vice procesa "
					+ "la compra: " + 
					c.getProposito());
		}
	}

}

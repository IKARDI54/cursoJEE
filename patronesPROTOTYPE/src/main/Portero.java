package main;

public class Portero implements Jugador,Cloneable{

	@Override
	public void correr() {
		System.out.println("portero corre");
	}

	@Override
	public void parar() {
		System.out.println("portero se para");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public Jugador clonar() {
		
		try {
			System.out.println("clonando portero");
			return (Jugador) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	
}

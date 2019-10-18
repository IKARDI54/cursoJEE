package main;

public class Delantero implements Jugador, Cloneable {

	@Override
	public void correr() {
		System.out.println("delantero corre");
	}

	@Override
	public void parar() {
		System.out.println("delantero para");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public Jugador clonar() {
		try {
			System.out.println("clonando delantero");
			return (Jugador) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

}

package main;

public class Jugador implements InterfazJugador {

	@Override
	public void entrenar() {
		System.out.println("jugador entrena");
	}
	
	@Override
	public void descansar() {
		System.out.println("jugador se toma un descanso");
	}
}

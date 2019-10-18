package main;

public class Main {

	public static void main(String[] args) {
		
		InterfazJugador ana = new Jugador();
		//ana = new EntrenadorPersonal(ana);
		EntrenadorPersonal maria = new EntrenadorPersonal(ana);
		
		maria.entrenar();
		maria.descansar();
	}

}

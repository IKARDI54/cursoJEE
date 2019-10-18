package main;

//esta es la clase que actua como DECORATOR
public class EntrenadorPersonal implements InterfazJugador{
	
	private InterfazJugador elementoAdecorar;

	public EntrenadorPersonal(InterfazJugador elementoAdecorar) {
		super();
		this.elementoAdecorar = elementoAdecorar;
	}

	@Override
	public void entrenar() {
		System.out.println("entrenador manda entrenar");
		elementoAdecorar.entrenar();
	}

	@Override
	public void descansar() {
		System.out.println("entrenador manda descanso");
		elementoAdecorar.descansar();
	}
	

}

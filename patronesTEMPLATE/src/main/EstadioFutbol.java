package main;

public class EstadioFutbol extends Estadio{

	@Override
	public void sacarJugadoresAlcampo() {
		System.out.println("sacando jugadores de futbol");
	}

	@Override
	public void arrancarJuego() {
		System.out.println("comenzando juego de futbol");
	}

	@Override
	public void finalizarJuego() {
		System.out.println("finalizando juego de futbol");
	}
	

}

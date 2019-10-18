package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		GestorPrototipos gestorPrototipos = 
				new GestorPrototipos();
		List<Jugador> equipo = 
				new ArrayList<Jugador>();
		equipo.add(gestorPrototipos.crearJugador("delantero"));
		equipo.add(gestorPrototipos.crearJugador("delantero"));
		equipo.add(gestorPrototipos.crearJugador("delantero"));
		equipo.add(gestorPrototipos.crearJugador("portero"));
		
		for (Jugador jugador : equipo) {
			jugador.correr();
		}
	}

}

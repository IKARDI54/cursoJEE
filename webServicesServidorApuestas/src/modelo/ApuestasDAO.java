package modelo;

import java.util.List;

import servicios.Apuesta;

public interface ApuestasDAO {

	boolean regitrarApuesta(Apuesta a);

	List<Apuesta> obtenerApuestas();

	void marcarApuestaComoGanadora(int numeroGanador);

}
package modelo;

import java.util.ArrayList;
import java.util.List;

import servicios.Apuesta;
import sun.security.krb5.internal.APOptions;

public class ApuestasDAOImpl implements ApuestasDAO {
	
	private static List<Apuesta> apuestas = 
			new ArrayList<Apuesta>();
	
	public boolean regitrarApuesta(Apuesta a) {
		//poner toString o no ponerlo al concatenar con 
		//un texto es lo mismo.
		System.out.println("guardando en bd : " + a);
		apuestas.add(a);
		return true;
	}
	
	public List<Apuesta> obtenerApuestas(){
		return apuestas;
	}
	
	public void marcarApuestaComoGanadora(int numeroGanador) {
		for (Apuesta apuesta : apuestas) {
			if(apuesta.getNumero() == numeroGanador) {
				apuesta.setGanado(true);
			}
		}
	}

}

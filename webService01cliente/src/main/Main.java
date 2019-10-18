package main;

import java.rmi.RemoteException;

import servicios.InterfazServicioApuestasProxy;

public class Main {

	public static void main(String[] args) {
		//para usar el servicio web generamos un proxy
		InterfazServicioApuestasProxy proxy = 
				new InterfazServicioApuestasProxy();
		try {
			proxy.registrarApuesta(55, 250);
			System.out.println("web service consumido correctamente");
		} catch (RemoteException e) {
			System.out.println("no pude invocar de forma remota"
					+ "el metodo del web service");
			e.printStackTrace();
		}
	}

}

package main;

import java.rmi.RemoteException;

import servicios.Ordenador;
import servicios.ServicioOrdenadoresProxy;

public class Main {

	public static void main(String[] args) {
		Ordenador o = new Ordenador(5, "ares", "portatil");
		ServicioOrdenadoresProxy proxy = 
				new ServicioOrdenadoresProxy();
		try {
			proxy.registrarCompra(o);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}

package servicios;

import javax.jws.WebService;

@WebService(targetNamespace = "http://servicios/", endpointInterface = "servicios.InterfazServicioApuestas", portName = "ServicioApuestasPort", serviceName = "ServicioApuestasService")
public class ServicioApuestas implements InterfazServicioApuestas{
	
	public void registrarApuesta(int idUsuario,double cantidad) {
		System.out.println("recibido idUsuario " + idUsuario +
				"apuesta: " + cantidad);
	}
	
}

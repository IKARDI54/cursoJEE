package servicios;

import javax.jws.WebService;

@WebService(targetNamespace = "http://servicios/", endpointInterface = "servicios.ServicioOrdenadores", portName = "ServicioComprasOrdenadoresPort", serviceName = "ServicioComprasOrdenadoresService")
public class ServicioComprasOrdenadores implements ServicioOrdenadores {
	public void registrarCompra(Ordenador ordenador) {
		System.out.println("registrar: " + 
				ordenador.toString());
	}
}

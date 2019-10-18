package servicios;

import javax.jws.WebService;

@WebService(name = "ServicioOrdenadores", targetNamespace = "http://servicios/")
public interface ServicioOrdenadores {

	void registrarCompra(Ordenador ordenador);

}
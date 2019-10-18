package servicios;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "InterfazServicioApuestas", targetNamespace = "http://servicios/")
public interface InterfazServicioApuestas {

	@WebMethod(operationName = "registrarApuesta", action = "urn:RegistrarApuesta")
	void registrarApuesta(@WebParam(name = "arg0") int idUsuario, @WebParam(name = "arg1") double cantidad);

}
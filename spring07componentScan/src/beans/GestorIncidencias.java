package beans;

import org.springframework.stereotype.Component;

@Component
public class GestorIncidencias {
	
	public void crearIncidencia(int idUsuario) {
		System.out.println(
			"creando incidencia para usuario: " + idUsuario);
	}

}

package beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GestorIncidencias {
	
	//con autowired le decimos a spring que busque la primera
	//bean que encuentre de tipo GestorUsuarios y se la asigne
	//al campo gestorUsuarios que acabamos de definir
	//@Autowired
	//@Qualifier("administradorUsuarios")
	//@Resource
	private GestorUsuarios gestorUsuarios;
	
	//autowired puede ir tambien en el constructor
	//consiguiendo el mismo efecto
	@Autowired
	public GestorIncidencias(GestorUsuarios gestorUsuarios) {
		super();
		this.gestorUsuarios = gestorUsuarios;
	}

	public void crearIncidencia(int idUsuario) {
		System.out.println(
			"creando incidencia para usuario: " + idUsuario);
		gestorUsuarios.notificarUsuario(idUsuario);
	}
	
	//autowired puede ir en el setter realizando la misma 
	//funcion
	//@Autowired
	public void setGestorUsuarios(GestorUsuarios gestorUsuarios) {
		this.gestorUsuarios = gestorUsuarios;
	}
	
}

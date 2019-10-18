package beans;

import org.springframework.stereotype.Component;

@Component
public class GestorUsuarios {
	
	public void notificarUsuario(int id) {
		System.out.println("notificar usuario: " + id);
	}

	public void borrarUsuario(int id) {
		System.out.println("borrando usuario: " + id);
	}
	
}

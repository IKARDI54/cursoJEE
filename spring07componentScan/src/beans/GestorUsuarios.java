package beans;

import org.springframework.stereotype.Component;

@Component
public class GestorUsuarios {

	public void borrarUsuario(int id) {
		System.out.println("borrando usuario: " + id);
	}
	
}

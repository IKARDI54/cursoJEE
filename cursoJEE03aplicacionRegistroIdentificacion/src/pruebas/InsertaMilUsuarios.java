package pruebas;

import modelo.Usuario;
import modelo.UsuariosDAO;
import modelo.UsuariosDAOImpl;

public class InsertaMilUsuarios {

	public static void main(String[] args) {
		String nombre = "eva";
		UsuariosDAO uDAO = new UsuariosDAOImpl();
		Usuario usuario = 
				new Usuario(nombre,"123", "eva@mail.com");
		for (int i = 0; i < 1000 ; i++) {
			System.out.println(
					"se ejecuta el for para i: " + i);
			usuario.setNombre(nombre+i);
			usuario.setEmail(usuario.getEmail());
			usuario.setPass(usuario.getPass());
			uDAO.registrarUsuario(usuario);
		}
		System.out.println("registrados 1000 usuarios");
	}//end main
}

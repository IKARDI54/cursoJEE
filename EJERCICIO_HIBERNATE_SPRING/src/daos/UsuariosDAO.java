package daos;

import modelo.Usuario;

public interface UsuariosDAO {

	public void registrarUsuario(Usuario u);
	public Usuario obtenerUsuarioPorEmailYpass(
			String email, String pass);
	
}

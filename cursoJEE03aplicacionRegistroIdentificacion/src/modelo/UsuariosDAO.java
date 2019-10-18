package modelo;

import java.util.ArrayList;
import java.util.List;

//aqui definimos las operaciones que se pueden hacer 
//con usuarios en base de datos
//otra clase indicara con su codigo que hacen dichas operaciones
//esa clase es la que se dice que implementa el DAO
public interface UsuariosDAO {
	
	public int registrarUsuario(Usuario u);
	public int obtenerIdUsuario(String email, String pass);
	public ArrayList<Usuario> obtenerUsuarios();
	public void borrarUsuario(String idUsuarioAborrar);
	public Usuario obtenerUsuarioPorId(int idInt);
	public void actualizarUsuario(Usuario usuarioGuardarCambios);
	public List<Usuario> obtenerUsuariosPorNombre(String nombreAbuscar);
	public List<Usuario> obtenerUsuariosPorNombreIndicandoComienzoYCuantos(String nombreAbuscar, int comienzo,
			int cuantos);
	public int obtenerTotalUsuarios(String nombreAbuscar);


}

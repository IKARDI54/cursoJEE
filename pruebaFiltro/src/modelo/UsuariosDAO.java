package modelo;
//aqui definimos las operaciones que se pueden hacer 
//con usuarios en base de datos
//otra clase indicara con su codigo que hacen dichas operaciones
//esa clase es la que se dice que implementa el DAO
public interface UsuariosDAO {
	
	public void registrarUsuario(Usuario u);
	public int obtenerIdUsuario(String email, String pass);

}

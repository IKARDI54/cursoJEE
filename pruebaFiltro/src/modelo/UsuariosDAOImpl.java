package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDAOImpl extends MasterDAO implements UsuariosDAO{

	public void comprobarConexion() {
		
	}
	
	@Override
	public void registrarUsuario(Usuario u) {
		conectar();
		try {
			PreparedStatement ps = conexion.prepareStatement(
					ConstantesSQL.SQL_INSERCION_USUARIO);
			ps.setString(1, u.getNombre());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPass());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
	}

	@Override
	public int obtenerIdUsuario(String email, String pass) {
		conectar();
		int idUsuario = -1;
		try {
			PreparedStatement ps = conexion.prepareStatement(
					ConstantesSQL.SQL_OBTENER_ID_USUARIO);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				idUsuario = rs.getInt("id");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return idUsuario;
	}
}

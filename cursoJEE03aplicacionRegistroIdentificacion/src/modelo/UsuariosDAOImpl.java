package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UsuariosDAOImpl extends MasterDAO implements UsuariosDAO{

	
	@Override
	public int registrarUsuario(Usuario u) {
		conectar();
		int idGenerada = -1;
		try {
			PreparedStatement ps = conexion.prepareStatement(
					ConstantesSQL.SQL_INSERCION_USUARIO, 
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, u.getNombre());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPass());
			ps.execute();
			//de la siguiente forma vamos a obtener el id 
			//generado
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next()) {
				//asi pedimos que nos de  la id generada
				idGenerada = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return idGenerada;
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

	@Override
	public ArrayList<Usuario> obtenerUsuarios() {
		conectar();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			PreparedStatement ps = 
					conexion.prepareStatement(
							ConstantesSQL.SQL_OBTENER_USUARIOS);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setNombre(rs.getString("nombre"));
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				usuarios.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return usuarios;
	}

	@Override
	public void borrarUsuario(String idUsuarioAborrar) {
		conectar();
		try {
			PreparedStatement ps = conexion.prepareStatement(
					ConstantesSQL.SQL_BORRAR_USUARIO);
			ps.setString(1, idUsuarioAborrar);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();		
	}

	@Override
	public Usuario obtenerUsuarioPorId(int idInt) {
		conectar();
		Usuario u = new Usuario();
		try {
			PreparedStatement ps = 
					conexion.prepareStatement(
							ConstantesSQL.SQL_OBTENER_USUARIO_POR_ID);
			ps.setInt(1, idInt);
			ResultSet rs = ps.executeQuery();
		
			if(rs.next()) {
				//next situa la result set en el primer resultado
				//Que aun no he procesado, el metodo next() 
				//Devuelve un true si dicho resultado tiene
				//informacion, por lo que este if se cumple
				//si hay un usuario en base de datos con el id 
				//indicado
				
				u.setEmail(rs.getString("email"));
				u.setNombre(rs.getString("nombre"));
				u.setPass(rs.getString("pass"));
				u.setId(rs.getInt("id"));				
			}//end if rs.next
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();		
		return u; //cuidado de dejar el return a null
	}

	@Override
	public void actualizarUsuario(Usuario usuarioGuardarCambios) {
		conectar();
		try {
			PreparedStatement ps = conexion.prepareStatement(
					ConstantesSQL.SQL_ACTUALIZAR_USUARIO);
			ps.setString(1, usuarioGuardarCambios.getNombre());
			ps.setString(2, usuarioGuardarCambios.getEmail());
			ps.setString(3, usuarioGuardarCambios.getPass());
			ps.setInt(4, usuarioGuardarCambios.getId());
			ps.executeUpdate();//analogo al ps.execute()
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();	
	}

	@Override
	public List<Usuario> obtenerUsuariosPorNombre(String nombreAbuscar) {
		conectar();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			PreparedStatement ps = 
				conexion.prepareStatement(
					ConstantesSQL.SQL_OBTENER_USUARIOS_POR_NOMBRE);
			ps.setString(1, "%"+nombreAbuscar+"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setNombre(rs.getString("nombre"));
				u.setPass(rs.getString("pass"));
				u.setEmail(rs.getString("email"));
				u.setId(rs.getInt("id"));
				usuarios.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		desconectar();
		return usuarios;
	}

	@Override
	public List<Usuario> obtenerUsuariosPorNombreIndicandoComienzoYCuantos(String nombreAbuscar, int comienzo,
			int cuantos) {
		conectar();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			PreparedStatement ps = 
				conexion.prepareStatement(
						ConstantesSQL.SQL_OBTENER_USUARIOS_INDICANDO_COMIENZO_Y_CUANTOS);
			ps.setString(1, "%" + nombreAbuscar + "%");
			ps.setInt(2, comienzo);
			ps.setInt(3, cuantos);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setNombre(rs.getString("nombre"));
				u.setPass(rs.getString("pass"));
				u.setEmail(rs.getString("email"));
				u.setId(rs.getInt("id"));
				usuarios.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return usuarios;
	}

	@Override
	public int obtenerTotalUsuarios(String nombreAbuscar) {
		conectar();
		int total = 0;
		try {
			PreparedStatement ps = 
				conexion.prepareStatement(
					ConstantesSQL.SQL_OBTENER_TOTAL_USUARIOS);
			ps.setString(1,"%"+nombreAbuscar+"%");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				total = rs.getInt("total");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return total;
	}
}

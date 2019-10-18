package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import modelo.Usuario;

public class UsuarioMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int numFila) throws SQLException {
		Usuario u = new Usuario();
		u.setNombre(rs.getString("nombre"));
		u.setPass(rs.getString("pass"));
		u.setEmail(rs.getString("email"));
		u.setId(rs.getInt("id"));
		return u;
	}

}

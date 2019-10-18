package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import modelo.Anuncio;

public class AnuncioMapper implements RowMapper<Anuncio>{

	@Override
	public Anuncio mapRow(ResultSet rs, int numeroFila) throws SQLException {
		Anuncio anuncio = new Anuncio();
		anuncio.setTitulo(rs.getString("titulo"));
		anuncio.setEmail(rs.getString("email"));
		anuncio.setDescripcion(rs.getString("descripcion"));
		anuncio.setId(rs.getInt("id"));
		return anuncio;
	}

}

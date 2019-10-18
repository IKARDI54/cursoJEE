package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriasDAOImpl extends MasterDAO 
implements CategoriasDAO{

	@Override
	public List<Categoria> obtenerCategorias() {
		conectar();
		List<Categoria> categorias = 
				new ArrayList<Categoria>();
		try {
			PreparedStatement ps = 
					conexion.prepareStatement(
							ConstantesSQL.SQL_OBTENER_CATEGORIAS);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Categoria c = new Categoria();
				c.setNombre(rs.getString("nombre"));
				c.setDescripcion(rs.getString("descripcion"));
				c.setId(rs.getInt("id"));
				categorias.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return categorias;
	}

}

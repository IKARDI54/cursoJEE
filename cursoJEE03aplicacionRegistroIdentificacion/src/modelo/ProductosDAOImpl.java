package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAOImpl extends MasterDAO implements ProductosDAO{
	
	@Override
	public void registrarProducto(Producto p) {
		conectar();
		try {
			PreparedStatement ps = 
					conexion.prepareStatement(
							ConstantesSQL.SQL_INSERCION_PRODUCTO);
			ps.setString(1, p.getNombre());
			ps.setDouble(2, p.getPrecio());
			ps.setString(3, p.getDescripcion());
			ps.setLong(4, p.getIdCategoria());
			ps.execute();
			//execute o executeUpdate para registros borrados y ediciones
			//executeQuery para sentencias tipo select o que devuelvan
			//informacion
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
	}

	@Override
	public List<Producto> obtenerProductos() {
		conectar();
		List<Producto> productos = new ArrayList<Producto>();
		try {
			PreparedStatement ps = conexion.prepareStatement( 
					ConstantesSQL.SQL_OBTENER_PRODUCTOS);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Producto p = new Producto();
				p.setNombre(rs.getString("nombre_producto"));
				p.setPrecio(rs.getDouble("precio_producto"));
				p.setDescripcion(rs.getString("descripcion_producto"));
				p.setId(rs.getInt("id_producto"));
				
				Categoria c = new Categoria();
				c.setNombre(rs.getString("nombre_categoria"));
				
				p.setCategoria(c);
				
				productos.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return productos;
	}

	@Override
	public Producto obtenerProductoPorId(int idProducto) {
		conectar();
		Producto p = new Producto();
		try {
			PreparedStatement ps = 
				conexion.prepareStatement(
					ConstantesSQL.SQL_OBTENER_PRODUCTO_POR_ID);
			ps.setInt(1, idProducto);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p.setNombre(rs.getString("nombre"));
				p.setPrecio(rs.getDouble("precio"));
				p.setDescripcion(rs.getString("descripcion"));
				p.setIdCategoria(rs.getInt("id_categoria"));
				p.setId(rs.getInt("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}


}

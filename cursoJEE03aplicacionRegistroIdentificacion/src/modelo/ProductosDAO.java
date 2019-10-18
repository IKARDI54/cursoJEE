package modelo;

import java.util.List;

public interface ProductosDAO {

	public void registrarProducto(Producto p);
	public List<Producto> obtenerProductos();
	public Producto obtenerProductoPorId(int parseInt);
	
	
}
